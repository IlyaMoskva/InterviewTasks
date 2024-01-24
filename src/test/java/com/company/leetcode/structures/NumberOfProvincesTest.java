package com.company.leetcode.structures;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfProvincesTest {
    public static Object[][] data() {
        return new Object[][] {
                new Object[] {2, new int[][] {{1,1,0},{1,1,0},{0,0,1}}},
                new Object[] {3, new int[][] {{1,0,0},{0,1,0},{0,0,1}}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int expected, int[][] isConnected) {
        assertEquals(expected, new NumberOfProvinces().findCircleNum(isConnected));
    }
}