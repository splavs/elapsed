package com.splavs.elapsed;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

/**
 * Get performance tests of ArrayList & LinkedList.
 *
 * @author Vyacheslav Silchenko
 */
@Elapsed
@RunWith(Parameterized.class)
public class ContainsTest {
    // Prepare test data
    private final TestData testDataInstance = TestData.INSTANCE;

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[TestData.TEST_RUNS][0]);
    }

    @Test
    @Elapsed
    public void should_ContainsArrayList() {
        testDataInstance.getArrayList().contains(0);
    }

    @Test
    @Elapsed
    public void should_ContainsLinkedList() {
        testDataInstance.getLinkedList().contains(0);
    }

}
