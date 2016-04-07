package com.splavs.elapsed;

import java.util.Random;

/**
 * Created by Vyacheslav Silchenko on 07.04.2016.
 */
public class TestData {
    protected static final int N = 10000000;
    protected static int[] TEST_DATA = new int[N];

    public static void prepareData() {
        Random rnd = new Random();
        for (int i = 0; i < N; i++) {
            TEST_DATA[i] = rnd.nextInt();
        }
    }
}
