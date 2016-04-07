package com.splavs.elapsed;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static com.splavs.elapsed.TestData.*;

/**
 * Few tests to test performance of sorts.
 *
 * @author Vyacheslav Silchenko
 */
@SuppressWarnings({"MismatchedReadAndWriteOfArray", "UnusedAssignment"})
@Elapsed
public class RemoveTests {

    @BeforeClass
    public static void setUp() throws Exception {
        prepareData();
    }

    @Test
    public void should_RemoveFirstFromArrayList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new ArrayList<Integer>(Arrays.asList(a));

        removeFirstFromArrayList(al);
    }

    @Elapsed
    private void removeFirstFromArrayList(List<Integer> al) {
        al.remove(0);
    }

    @Test
    public void should_RemoveFirstFromLinkedList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new LinkedList<Integer>(Arrays.asList(a));

        removeFirstFromLinkedList(al);
    }

    @Elapsed
    private void removeFirstFromLinkedList(List<Integer> al) {
        al.remove(0);
    }

    @Test
    public void should_RemoveLastFromArrayList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new ArrayList<Integer>(Arrays.asList(a));

        removeLastFromArrayList(al);
    }

    @Elapsed
    private void removeLastFromArrayList(List<Integer> al) {
        al.remove(al.size()-1);
    }

    @Test
    public void should_RemoveLastFromLinkedList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new LinkedList<Integer>(Arrays.asList(a));

        removeLastFromLinkedList(al);
    }

    @Elapsed
    private void removeLastFromLinkedList(List<Integer> al) {
        al.remove(al.size()-1);
    }

    @Test
    public void should_RemoveMiddleFromArrayList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new ArrayList<Integer>(Arrays.asList(a));

        removeMiddleFromArrayList(al);
    }

    @Elapsed
    private void removeMiddleFromArrayList(List<Integer> al) {
        al.remove(al.size()/2);
    }

    @Test
    public void should_RemoveMiddleFromLinkedList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new LinkedList<Integer>(Arrays.asList(a));

        removeMiddleFromLinkedList(al);
    }

    @Elapsed
    private void removeMiddleFromLinkedList(List<Integer> al) {
        al.remove(al.size()/2);
    }




}
