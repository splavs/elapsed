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

    private int[] testData;
    private Integer[] testDataInteger;

    private List<Integer> arrayList;
    private List<Integer> linkedList;

    TestData() {
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
        testData = new int[N];
        Random rnd = new Random();
        for (int i = 0; i < N; i++) {
            testData[i] = rnd.nextInt();
        }
    }

    @Elapsed
    private void prepareTestDataArrayInteger() {
        testDataInteger = new Integer[N];
        for (int i = 0; i < N; i++) {
            testDataInteger[i] = testData[i];
        }
    }

    @Elapsed
    private void prepareArrayList() {
        arrayList = new ArrayList<Integer>(N);
        for (int i : testData) {
            arrayList.add(i);
        }
    }

    @Elapsed
    private void prepareLinkedList() {
        linkedList= new LinkedList<Integer>();
        for (int i : testData) {
            linkedList.add(i);
        }
    }




}
