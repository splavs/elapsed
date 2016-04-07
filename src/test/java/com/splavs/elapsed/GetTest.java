package com.splavs.elapsed;

import org.junit.Test;
import java.util.List;

/**
 * Get performance tests of ArrayList & LinkedList.
 *
 * @author Vyacheslav Silchenko
 */
@Elapsed
public class GetTest {
    // Prepare test data
    private final TestData testDataInstance = TestData.INSTANCE;

    @Test
    @Elapsed
    public void should_GetFirstArrayList() {
        testDataInstance.getArrayList().get(0);
    }

    @Test
    @Elapsed
    public void should_GetFirstLinkedList() {
        testDataInstance.getLinkedList().get(0);
    }

    @Test
    @Elapsed
    public void should_GetLastArrayList() {
        final List<Integer> list = testDataInstance.getArrayList();
        list.get(list.size()-1);
    }

    @Test
    @Elapsed
    public void should_GetLastLinkedList() {
        final List<Integer> list = testDataInstance.getLinkedList();
        list.get(list.size()-1);
    }

    @Test
    @Elapsed
    public void should_GetMiddleArrayList() {
        final List<Integer> list = testDataInstance.getArrayList();
        list.get(list.size()/2);
    }

    @Test
    @Elapsed
    public void should_GetMiddleLinkedList() {
        final List<Integer> list = testDataInstance.getLinkedList();
        list.get(list.size()/2);
    }
}
