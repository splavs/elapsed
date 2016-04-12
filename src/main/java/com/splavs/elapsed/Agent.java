package com.splavs.elapsed;

/**
 * Java agent class.
 * Method transform() will override all method behaviour - add output elapsed execution time.
 *
 * @author Vyacheslav Silchenko
 */

import javassist.*;

import java.io.ByteArrayInputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

class Agent implements ClassFileTransformer {
    public static Instrumentation inst;

    public static void premain(String agentArgs, Instrumentation inst) {
        Agent.inst = inst;
        // registers the transformer
        Agent.inst.addTransformer(new Agent());
    }

    public static long sizeOf(Object object) {
        if (inst == null) {
            throw  new IllegalStateException("Agent not initialized");
        }

        return inst.getObjectSize(object);
    }

    //TODO http://www.javaspecialists.eu/archive/Issue142.html
    public static void deepSizeOf(Object obj) {

    }

    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = null;
        byte[] bytes = classfileBuffer;
        try {
            ctClass = pool.makeClass(new ByteArrayInputStream(bytes));
            if (ctClass.hasAnnotation(Elapsed.class)) {

                for (CtBehavior method : ctClass.getDeclaredBehaviors()) {
                    if (!method.isEmpty() && method.hasAnnotation(Elapsed.class)) {
                        method.addLocalVariable("elapsedTime", CtClass.longType);
                        method.insertBefore("elapsedTime = System.currentTimeMillis();");
                        method.insertAfter(String.format("{elapsedTime = System.currentTimeMillis() - elapsedTime; System.out.println(\"Class %s Method %s Executed in ms: \" + elapsedTime);}", className, method.getName()));
                    }
                }

//                StringBuilder sb = new StringBuilder();
//
//                for (CtField field : ctClass.getDeclaredFields()) {
//                    if (field.hasAnnotation(MemoryUsage.class)) {
//                        sb.append(String.format("{System.out.println(\"%s, %d\");}", field.getName(), Agent.sizwOf(field)));
//                    }
//                }
//
//                final CtConstructor constructor = ctClass.getConstructor(null);
//                constructor.insertAfter(sb.toString());



            }

            bytes = ctClass.toBytecode();
        } catch (Exception ex) {
            System.err.println("Could not instrument " + className);
        } finally {
            if (ctClass != null) {
                ctClass.detach();
            }

        }

        return bytes;

    }
}
