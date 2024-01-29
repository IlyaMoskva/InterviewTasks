package com.company.leetcode.structures;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MinReorderRoadsTest {
    public static Object[][] data() {
        return new Object[][] {
                new Object[]{3, 6, new int[][]{{0, 1}, {1, 3},{2,3},{4,0},{4,5}}},
                new Object[] {2, 5, new int[][] {{1,0},{1,2},{3,2},{3,4}}},
                new Object[] {0, 3, new int[][] {{1,0},{2,0}}},
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int expected, int numberOfCities, int[][] connections) {
        assertEquals(expected, new MinReorderRoads().minReorder(numberOfCities, connections));
    }
}