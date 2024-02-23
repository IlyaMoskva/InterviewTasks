package com.company.leetcode.structures;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class RottingOrangesTest {

    RottingOranges ro = new RottingOranges();

    public static Object[][] data() {
        return new Object[][] {
                new Object[] { 4, new int[][] {{2,1,1},{1,1,0},{0,1,1}} },
                new Object[] { -1, new int[][] {{2,1,1},{0,1,1},{1,0,1}} },
                new Object[] { 0, new int[][] {{0,2}} }
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void orangesRottingTest(int expected, int[][] given) {
        assertEquals(expected, ro.orangesRotting(given));
    }
}