package com.company.leetcode;

import com.company.leetcode.matrix.SpiralMatrix2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrix2Test {

    SpiralMatrix2 sm = new SpiralMatrix2();

    static Object[][] data() {
        return new Object[][] {
                {1, new int[][]{{1}}},
                {2, new int[][]{{1,2},{4,3}}},
                {3, new int[][]{{1,2,3},{8,9,4},{7,6,5}}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void generateMatrix(int n, int[][] expected) {
        assertArrayEquals(expected, sm.generateMatrix(n));
    }

    @Test
    void generateMatrix2() {
        for (int i = 1; i < 10; i++) {
            assertEquals(i, sm.generateMatrix(i).length);
        }
    }
}