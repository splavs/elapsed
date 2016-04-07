package com.splavs.elapsed;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;
import static com.splavs.elapsed.TestData.*;
/**
 * Few tests to test performance of sorts.
 *
 * @author Vyacheslav Silchenko
 */
@SuppressWarnings({"MismatchedReadAndWriteOfArray", "UnusedAssignment"})
@Elapsed
public class AddTests {

    @BeforeClass
    public static void setUp() throws Exception {
        prepareData();
    }

    @Test
    public void should_InsertFirstIntoArrayList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new ArrayList<Integer>(Arrays.asList(a));

        insertFirstIntoArrayList(al);
    }

    @Elapsed
    private void insertFirstIntoArrayList(List<Integer> al) {
        al.add(0, 0);
    }

    @Test
    public void should_InsertFirstIntoLinkedList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new LinkedList<Integer>(Arrays.asList(a));

        insertFirstIntoLinkedList(al);
    }

    @Elapsed
    private void insertFirstIntoLinkedList(List<Integer> al) {
        al.add(0, 0);
    }

    @Test
    public void should_InsertLastIntoArrayList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new ArrayList<Integer>(Arrays.asList(a));

        insertLastIntoArrayList(al);
    }

    @Elapsed
    private void insertLastIntoArrayList(List<Integer> al) {
        al.add(al.size(), 0);
    }

    @Test
    public void should_InsertLastIntoLinkedList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new LinkedList<Integer>(Arrays.asList(a));

        insertLastIntoLinkedList(al);
    }

    @Elapsed
    private void insertLastIntoLinkedList(List<Integer> al) {
        al.add(al.size(), 0);
    }

    @Test
    public void should_InsertMiddleIntoArrayList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new ArrayList<Integer>(Arrays.asList(a));

        insertMiddleIntoArrayList(al);
    }

    @Elapsed
    private void insertMiddleIntoArrayList(List<Integer> al) {
        al.add(al.size()/2, 0);
    }

    @Test
    public void should_InsertMiddleIntoLinkedList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new LinkedList<Integer>(Arrays.asList(a));

        insertMiddleIntoLinkedList(al);
    }

    @Elapsed
    private void insertMiddleIntoLinkedList(List<Integer> al) {
        al.add(al.size()/2, 0);
    }




}
