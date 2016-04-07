package com.splavs.elapsed;

import org.junit.Test;
import java.util.List;

/**
 * Add performance tests of ArrayList & LinkedList.
 *
 * @author Vyacheslav Silchenko
 */
@Elapsed
public class AddTest {
    // Prepare test data
    private final TestData testDataInstance = TestData.INSTANCE;

    @Test
    @Elapsed
    public void should_AddFirstArrayList() {
        testDataInstance.getArrayList().add(0, 0);
    }

    @Test
    @Elapsed
    public void should_AddFirstLinkedList() {
        testDataInstance.getLinkedList().add(0, 0);
    }

    @Test
    @Elapsed
    public void should_AddLastArrayList() {
        final List<Integer> list = testDataInstance.getArrayList();
        list.add(list.size(), 0);
    }

    @Test
    @Elapsed
    public void should_AddLastLinkedList() {
        final List<Integer> list = testDataInstance.getLinkedList();
        list.add(list.size()-1);
    }

    @Test
    @Elapsed
    public void should_AddMiddleArrayList() {
        final List<Integer> list = testDataInstance.getArrayList();
        list.add(list.size()/2);
    }

    @Test
    @Elapsed
    public void should_AddMiddleLinkedList() {
        final List<Integer> list = testDataInstance.getLinkedList();
        list.add(list.size()/2);
    }

}
