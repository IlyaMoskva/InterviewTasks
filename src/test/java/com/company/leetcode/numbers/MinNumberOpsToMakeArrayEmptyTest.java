package com.company.leetcode.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MinNumberOpsToMakeArrayEmptyTest {

    public static Object[][] data() {
        return new Object[][]{
                new Object[]{4, new int[]{2,3,3,2,2,4,2,3,4}},
                new Object[]{-1, new int[]{2,1,2,2,3,3}},
                new Object[]{-1, new int[]{2,1,1,2,2,3,3,5}},
                new Object[]{-1, new int[] {0, 3, 0, 4}},
                new Object[]{-1, new int[] {0, 3, 0}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void minOperationsTest(int expected, int[] given) {
        assertEquals(expected, new MinNumberOpsToMakeArrayEmpty().minOperations(given));
    }

}