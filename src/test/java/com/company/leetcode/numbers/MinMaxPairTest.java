package com.company.leetcode.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxPairTest {
    public static Object[][] data() {
        return new Object[][]{
                new Object[]{7, new int[]{3,5,2,3}},
                new Object[]{8, new int[]{3,5,4,2,4,6}},
                new Object[]{0, new int[] {0, 0}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void minMaxTest(int expected, int[] given) {
        assertEquals(expected, new MinMaxPair().minPairSum(given));
    }
}