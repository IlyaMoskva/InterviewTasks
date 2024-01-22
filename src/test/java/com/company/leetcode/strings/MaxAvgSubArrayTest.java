package com.company.leetcode.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MaxAvgSubArrayTest {
    public static Object[][] data() {
        return new Object[][]{
                new Object[]{12.75, 4, new int[]{1,12,-5,-6,50,3}},
                new Object[]{10, 1, new int[]{10}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void findMaxAverageTest(double expected, int k, int[] given) {
        assertEquals(expected, new MaxAvgSubArray().findMaxAverage(given, k));
    }
}