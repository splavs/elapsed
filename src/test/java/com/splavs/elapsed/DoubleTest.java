package com.splavs.elapsed;

import org.junit.Test;

/**
 * Few tests to test performance of different operations.
 *
 * @author Vyacheslav Silchenko
 */
@SuppressWarnings({"MismatchedReadAndWriteOfArray", "UnusedAssignment"})
@Elapsed
public class DoubleTest {

    private static final int MAX_ITERATION = Integer.MAX_VALUE / 10;

    @Test
    @Elapsed
    public void should_MultiplyBy0_5_Array_Double() {
        double[] a = new double[MAX_ITERATION];
        for (int i = 0; i < MAX_ITERATION; i++) {
            a[i] = i * 0.5;
        }
    }

    @Test
    @Elapsed
    public void should_DivideBy2_Array_Double() {
        double[] a = new double[MAX_ITERATION];
        for (int i = 0; i < MAX_ITERATION; i++) {
            a[i] = i / 2;
        }
    }


}
