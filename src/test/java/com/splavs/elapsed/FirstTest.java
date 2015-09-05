package com.splavs.elapsed;

import org.junit.Test;

/**
 * Class description goes here.
 *
 * @author Vyacheslav Silchenko
 */
@Elapsed
public class FirstTest {

    private static final long MAX_ITERATION = (long)Integer.MAX_VALUE;

    @Test
    @Elapsed
    public void should_DivBy2() {
        for (long i = 0; i < MAX_ITERATION; i++) {
            int a = 5/2;

        }
    }

    @Test
    @Elapsed
    public void should_MultyBy05() {
        for (long i = 0; i < MAX_ITERATION; i++) {
            int a = (int)(5*0.5);

        }
    }

    @Test
    @Elapsed
    public void should_MultyBy2() {
        for (long i = 0; i < MAX_ITERATION; i++) {
            int a = 5 * 2;

        }
    }

    @Test
    @Elapsed
    public void should_MultyBy2_() {
        for (long i = 0; i < MAX_ITERATION; i++) {
            int a = 5 << 1;

        }
    }
}
