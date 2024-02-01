package com.company.leetcode.structures;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class NearestExitTest {

    public static Object[][] data() {
        return new Object[][] {
            new Object[] {2, new char[][] {{'+','+','+'},{'.','.','.'},{'+','+','+'}}, new int[]{1,0} },
            new Object[] {1, new char[][] {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}}, new int[]{1,2} },
            new Object[] {-1, new char[][] {{'.','+'}}, new int[]{0,0} },
            new Object[] {7, new char[][] {
                    {'+','.','+','+','+','+','+'},
                    {'+','.','+','.','.','.','+'},
                    {'+','.','+','.','+','.','+'},
                    {'+','.','.','.','.','.','+'},
                    {'+','+','+','+','.','+','.'}}, new int[]{0,1} },
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int expected, char[][] maze, int[] entrance) {
        assertEquals(expected, new NearestExit().nearestExit(maze, entrance));
    }

}