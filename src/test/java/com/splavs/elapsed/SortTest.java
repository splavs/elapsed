package com.splavs.elapsed;

import org.junit.Test;
import java.util.*;

/**
 * Few tests to test performance of sorts.
 *
 * @author Vyacheslav Silchenko
 */
@Elapsed
public class SortTest {
    // Prepare test data
    private final TestData testDataInstance = TestData.INSTANCE;

    @Test
    @Elapsed
    public void should_SortIntsArray() {
        Arrays.sort(testDataInstance.getTestData());
    }

    @Test
    @Elapsed
    public void should_SortIntegersArray() {
        Arrays.sort(testDataInstance.getTestDataInteger());
    }

    @Test
    @Elapsed
    public void should_SortArrayList() {
        Collections.sort(testDataInstance.getArrayList());
    }

    @Test
    @Elapsed
    public void should_SortLinkedList() {
        Collections.sort(testDataInstance.getLinkedList());
    }

}
