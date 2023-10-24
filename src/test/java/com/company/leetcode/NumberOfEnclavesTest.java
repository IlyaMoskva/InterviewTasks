package com.company.leetcode;

import com.company.leetcode.matrix.NumberOfEnclaves;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfEnclavesTest {

    NumberOfEnclaves noe = new NumberOfEnclaves();

    public static Object[][] data() {
        return new Object[][] {
                new Object [] {3, new int[][] {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}}},
                new Object [] {0, new int[][] {{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}}}
        };
    }
    @ParameterizedTest
    @MethodSource("data")
    void numEnclaves(int expected, int[][] given) {
        assertEquals(expected, noe.numEnclaves(given));
    }
}