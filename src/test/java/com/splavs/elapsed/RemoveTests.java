package com.splavs.elapsed;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;

/**
 * Remove performance tests of ArrayList & LinkedList.
 *
 * @author Vyacheslav Silchenko
 */
@Elapsed
public class RemoveTests {
    // Prepare test data
    private final TestData testDataInstance = TestData.INSTANCE;

    @Test
    @Elapsed
    public void should_RemoveFirstArrayList() {
        testDataInstance.getArrayList().remove(0);
    }

    @Test
    @Elapsed
    public void should_RemoveFirstLinkedList() {
        testDataInstance.getLinkedList().remove(0);
    }

    @Test
    @Elapsed
    public void should_RemoveLastArrayList() {
        final List<Integer> list = testDataInstance.getArrayList();
        list.remove(list.size()-1);
    }

    @Test
    @Elapsed
    public void should_RemoveLastLinkedList() {
        final List<Integer> list = testDataInstance.getLinkedList();
        list.remove(list.size()-1);
    }

    @Test
    @Elapsed
    public void should_RemoveMiddleArrayList() {
        final List<Integer> list = testDataInstance.getArrayList();
        list.remove(list.size()/2);
    }

    @Test
    @Elapsed
    public void should_RemoveMiddleLinkedList() {
        final List<Integer> list = testDataInstance.getLinkedList();
        list.remove(list.size()/2);
    }
}
