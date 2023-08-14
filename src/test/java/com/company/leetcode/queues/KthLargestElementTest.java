package com.company.leetcode.queues;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementTest {

    KthLargestElement le = new KthLargestElement();

    public static Object[][] data() {
        return new Object[][]{
                new Object[]{new int[] {3,2,1,5,6,4}, 2, 5},
                new Object[]{new int[] {3,2,3,1,2,4,5,5,6}, 4, 4}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void findKthLargest(int[] nums, int k, int expected) {
        assertEquals(expected, le.findKthLargest(nums, k));
    }
}