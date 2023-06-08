package com.company.leetcode.matrix;

import static org.junit.jupiter.api.Assertions.*;

class NegativeNumbersCountTest {

    NegativeNumbersCount negativeNumbersCount = new NegativeNumbersCount();

    @org.junit.jupiter.api.Test
    void countNegatives() {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        assertEquals(8, negativeNumbersCount.countNegatives(grid));
    }

    @org.junit.jupiter.api.Test
    void countNegatives2() {
        int[][] grid = {{3,2},{1,0}};
        assertEquals(0, negativeNumbersCount.countNegatives(grid));
    }

    @org.junit.jupiter.api.Test
    void countNegatives3() {
        int[][] grid = {{1,-1},{-1,-1}};
        assertEquals(3, negativeNumbersCount.countNegatives(grid));
    }

    @org.junit.jupiter.api.Test
    void countNegatives4() {
        int[][] grid = {{-1}};
        assertEquals(1, negativeNumbersCount.countNegatives(grid));
    }
}