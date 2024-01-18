package com.company.leetcode.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MaxConseqOnes3Test {

    public static Object[][] data() {
        return new Object[][]{
                new Object[]{6, 2, new int[]{1,1,1,0,0,0,1,1,1,1,0}},
                new Object[]{10, 3, new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}},
                new Object[]{2, 2, new int[] {0, 0}},
                new Object[]{3, 3, new int[] {0, 0, 0}},
                new Object[]{3, 3, new int[] {1,1,1}},
                new Object[]{5, 3, new int[] {1,1,1,1,1}},
                new Object[]{3, 3, new int[] {1,1,0}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void longestOnesTest(int expected, int k, int[] given) {
        assertEquals(expected, new MaxConseqOnes3().longestOnes(given, k));
    }

}