package com.splavs.elapsed;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;

/**
 * Add performance tests of ArrayList & LinkedList.
 *
 * @author Vyacheslav Silchenko
 */
@Elapsed
public class AddTests {

    @BeforeClass
    public static void setUp() throws Exception {
        TestData.INSTANCE.prepareData();
        System.out.println();
    }

    @Test
    @Elapsed
    public void should_AddFirstArrayList() {
        TestData.INSTANCE.getArrayList().add(0, 0);
    }

    @Test
    @Elapsed
    public void should_AddFirstLinkedList() {
        TestData.INSTANCE.getLinkedList().add(0, 0);
    }

    @Test
    @Elapsed
    public void should_AddLastArrayList() {
        final List<Integer> list = TestData.INSTANCE.getArrayList();
        list.add(list.size(), 0);
    }

    @Test
    @Elapsed
    public void should_AddLastLinkedList() {
        final List<Integer> list = TestData.INSTANCE.getLinkedList();
        list.add(list.size()-1);
    }

    @Test
    @Elapsed
    public void should_AddMiddleArrayList() {
        final List<Integer> list = TestData.INSTANCE.getArrayList();
        list.add(list.size()/2);
    }

    @Test
    @Elapsed
    public void should_AddMiddleLinkedList() {
        final List<Integer> list = TestData.INSTANCE.getLinkedList();
        list.add(list.size()/2);
    }

}
