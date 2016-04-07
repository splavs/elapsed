package com.splavs.elapsed;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;

/**
 * Get performance tests of ArrayList & LinkedList.
 *
 * @author Vyacheslav Silchenko
 */
@Elapsed
public class GetTests {

    @BeforeClass
    public static void setUp() throws Exception {
        TestData.INSTANCE.prepareData();
        System.out.println();
    }

    @Test
    @Elapsed
    public void should_GetFirstArrayList() {
        TestData.INSTANCE.getArrayList().get(0);
    }

    @Test
    @Elapsed
    public void should_GetFirstLinkedList() {
        TestData.INSTANCE.getLinkedList().get(0);
    }

    @Test
    @Elapsed
    public void should_GetLastArrayList() {
        final List<Integer> list = TestData.INSTANCE.getArrayList();
        list.get(list.size()-1);
    }

    @Test
    @Elapsed
    public void should_GetLastLinkedList() {
        final List<Integer> list = TestData.INSTANCE.getLinkedList();
        list.get(list.size()-1);
    }

    @Test
    @Elapsed
    public void should_GetMiddleArrayList() {
        final List<Integer> list = TestData.INSTANCE.getArrayList();
        list.get(list.size()/2);
    }

    @Test
    @Elapsed
    public void should_GetMiddleLinkedList() {
        final List<Integer> list = TestData.INSTANCE.getLinkedList();
        list.get(list.size()/2);
    }
}
