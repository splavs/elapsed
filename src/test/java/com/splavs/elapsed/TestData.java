package com.splavs.elapsed;

import java.util.*;

/**
 * Prepare test data.
 * @author Vyacheslav Silchenko
 */
@Elapsed
public enum TestData {
    INSTANCE;

    private final int N = 10000000;
    private final int[] testData = new int[N];
    private final Integer[] testDataInteger = new Integer[N];
    private List<Integer> arrayList;
    private List<Integer> linkedList;

    public void prepareData() {
        prepareTestDataArrayInt();
        prepareTestDataArrayInteger();
        prepareArrayList();
        prepareLinkedList();

    }

    public List<Integer> getArrayList() {
        return arrayList;
    }

    public List<Integer> getLinkedList() {
        return linkedList;
    }

    public int[] getTestData() {
        return testData;
    }

    public Integer[] getTestDataInteger() {
        return testDataInteger;
    }

    @Elapsed
    private void prepareTestDataArrayInt() {
        Random rnd = new Random();
        for (int i = 0; i < N; i++) {
            testData[i] = rnd.nextInt();
        }
    }

    @Elapsed
    private void prepareTestDataArrayInteger() {
        for (int i = 0; i < N; i++) {
            testDataInteger[i] = testData[i];
        }
    }

    @Elapsed
    private void prepareArrayList() {
        Integer[] a = getTestDataInteger();
        arrayList = new ArrayList<Integer>(Arrays.asList(a));
    }

    @Elapsed
    private void prepareLinkedList() {
        Integer[] a = getTestDataInteger();
        linkedList = new LinkedList<Integer>(Arrays.asList(a));
    }




}
