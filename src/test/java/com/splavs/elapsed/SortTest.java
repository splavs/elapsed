package com.splavs.elapsed;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Few tests to test performance of sorts.
 *
 * @author Vyacheslav Silchenko
 */
@SuppressWarnings({"MismatchedReadAndWriteOfArray", "UnusedAssignment"})
@Elapsed
public class SortTest {

    private static final int N = 10000000;
    private int[] test_data;

    @Before
    public void prepareData() {
        Random rnd = new Random();
        test_data = new int[N];
        for (int i = 0; i < N; i++) {
            test_data[i] = rnd.nextInt();
        }


    }
    @Test
    @Elapsed
    @SuppressWarnings("ManualArrayCopy")
    public void should_SortInts() {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = test_data[i];
        }

        Arrays.sort(a);
    }

    @Test
    @Elapsed
    public void should_SortIntegers() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = test_data[i];
        }

        Arrays.sort(a);
    }

    @Test
    @Elapsed
    public void should_SortArrayList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = test_data[i];
        }


        List<Integer> al;
        al = new ArrayList<Integer>(Arrays.asList(a));

        Collections.sort(al);
    }


}
