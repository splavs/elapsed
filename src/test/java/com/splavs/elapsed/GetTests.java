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
public class GetTests {

    @BeforeClass
    public static void setUp() throws Exception {
        prepareData();
    }

    @Test
    public void should_GetFirstFromArrayList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new ArrayList<Integer>(Arrays.asList(a));

        getFirstFromArrayList(al);
    }

    @Elapsed
    private void getFirstFromArrayList(List<Integer> al) {
        al.get(0);
    }

    @Test
    public void should_GetFirstFromLinkedList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new LinkedList<Integer>(Arrays.asList(a));

        getFirstFromLinkedList(al);
    }

    @Elapsed
    private void getFirstFromLinkedList(List<Integer> al) {
        al.get(0);
    }

    @Test
    public void should_GetLastFromArrayList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new ArrayList<Integer>(Arrays.asList(a));

        getLastFromArrayList(al);
    }

    @Elapsed
    private void getLastFromArrayList(List<Integer> al) {
        al.get(al.size()-1);
    }

    @Test
    public void should_GetLastFromLinkedList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new LinkedList<Integer>(Arrays.asList(a));

        getLastFromLinkedList(al);
    }

    @Elapsed
    private void getLastFromLinkedList(List<Integer> al) {
        al.get(al.size()-1);
    }

    @Test
    public void should_GetMiddleFromArrayList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new ArrayList<Integer>(Arrays.asList(a));

        getMiddleFromArrayList(al);
    }

    @Elapsed
    private void getMiddleFromArrayList(List<Integer> al) {
        al.get(al.size()/2);
    }

    @Test
    public void should_GetMiddleFromLinkedList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        List<Integer> al;
        al = new LinkedList<Integer>(Arrays.asList(a));

        getMiddleFromLinkedList(al);
    }

    @Elapsed
    private void getMiddleFromLinkedList(List<Integer> al) {
        al.get(al.size()/2);
    }




}
