package com.splavs.elapsed;

/**
 * Java agent class.
 * Method transform() will override all method behaviour - add output elapsed execution time.
 *
 * @author Vyacheslav Silchenko
 */

import javassist.ClassPool;
import javassist.CtBehavior;
import javassist.CtClass;

import java.io.ByteArrayInputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

class Agent implements ClassFileTransformer {
    public static void premain(String agentArgs, Instrumentation inst) {
        // registers the transformer
        inst.addTransformer(new Agent());
    }

    @Override
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
                        method.insertAfter("{elapsedTime = System.currentTimeMillis() - elapsedTime;"
                                + "System.out.println(\"Class " + className + " Method " + method.getName() + " Executed in ms: \" + elapsedTime);}");

                    }
                }
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
