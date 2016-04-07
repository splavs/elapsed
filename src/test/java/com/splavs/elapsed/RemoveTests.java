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

    @BeforeClass
    public static void setUp() {
        TestData.INSTANCE.prepareData();
        System.out.println();
    }

    @Test
    @Elapsed
    public void should_RemoveFirstArrayList() {
        TestData.INSTANCE.getArrayList().remove(0);
    }

    @Test
    @Elapsed
    public void should_RemoveFirstLinkedList() {
        TestData.INSTANCE.getLinkedList().remove(0);
    }

    @Test
    @Elapsed
    public void should_RemoveLastArrayList() {
        final List<Integer> list = TestData.INSTANCE.getArrayList();
        list.remove(list.size()-1);
    }

    @Test
    @Elapsed
    public void should_RemoveLastLinkedList() {
        final List<Integer> list = TestData.INSTANCE.getLinkedList();
        list.remove(list.size()-1);
    }

    @Test
    @Elapsed
    public void should_RemoveMiddleArrayList() {
        final List<Integer> list = TestData.INSTANCE.getArrayList();
        list.remove(list.size()/2);
    }

    @Test
    @Elapsed
    public void should_RemoveMiddleLinkedList() {
        final List<Integer> list = TestData.INSTANCE.getLinkedList();
        list.remove(list.size()/2);
    }
}
