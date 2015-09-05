package com.splavs.elapsed;

import org.junit.Test;

/**
 * Class description goes here.
 *
 * @author Vyacheslav Silchenko
 */
@Elapsed
public class FirstTest {

    private static final int MAX_ITERATION = Integer.MAX_VALUE/10;

    @Test
    //@Elapsed
    public void should_DivideBy2() {
        for (int i = 0; i < MAX_ITERATION; i++) {
            int a = 5/2;

        }
    }

    @Test
    //@Elapsed
    public void should_MultiplyBy0_5() {
        for (int  i = 0; i < MAX_ITERATION; i++) {
            int a = (int)(5*0.5);

        }
    }

    @Test
    //@Elapsed
    public void should_MultiplyBy2() {
        for (int i = 0; i < MAX_ITERATION; i++) {
            int a = 5 * 2;

        }
    }

    @Test
    //@Elapsed
    public void should_MultiplyBy2_BitShift() {
        for (int  i = 0; i < MAX_ITERATION; i++) {
            int a = 5 << 1;

        }
    }

    @Test
    @Elapsed
    public void should_DivideBy2_Array() {
        int[] a = new int[MAX_ITERATION];
        for (int i = 0; i < MAX_ITERATION; i++) {
            a[i] = i/2;
        }
    }

    @Test
    @Elapsed
    public void should_MultiplyBy0_5_Array() {
        int[] a = new int[MAX_ITERATION];
        for (int i = 0; i < MAX_ITERATION; i++) {
            a[i] = (int)(5*0.5);
        }
    }

    @Test
    @Elapsed
    public void should_MultiplyBy2_Array() {
        int[] a = new int[MAX_ITERATION];
        for (int i = 0; i < MAX_ITERATION; i++) {
            a[i] = 5*2;
        }
    }

    @Test
    @Elapsed
    public void should_MultiplyBy2_BitShift_Array() {
        int[] a = new int[MAX_ITERATION];
        for (int i = 0; i < MAX_ITERATION; i++) {
            a[i] = i << 1;
        }
    }
}
