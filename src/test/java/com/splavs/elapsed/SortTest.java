package com.splavs.elapsed;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;

/**
 * Few tests to test performance of sorts.
 *
 * @author Vyacheslav Silchenko
 */
@Elapsed
public class SortTest {

    @BeforeClass
    public static void setUp() throws Exception {
        TestData.INSTANCE.prepareData();
        System.out.println();
    }

    @Test
    @Elapsed
    public void should_SortIntsArray() {
        Arrays.sort(TestData.INSTANCE.getTestData());
    }

    @Test
    @Elapsed
    public void should_SortIntegersArray() {
        Arrays.sort(TestData.INSTANCE.getTestDataInteger());
    }

    @Test
    @Elapsed
    public void should_SortArrayList() {
        Collections.sort(TestData.INSTANCE.getArrayList());
    }

    @Test
    @Elapsed
    public void should_SortLinkedList() {
        Collections.sort(TestData.INSTANCE.getLinkedList());
    }

}
