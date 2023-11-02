package com.company.leetcode.matrix;

import com.company.leetcode.matrix.SolveWithBrainpower;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class SolveWithBrainpowerTest {

    static Object[][] data() {
        return new Object[][] {
                {new int[][] {{1,1},{2,2},{3,3},{4,4},{5,5}}, 7},
                {new int[][] {{3,2},{4,3},{4,4},{2,5}}, 5},
                {new int[][] {{5,5},{4,1},{4,4},{2,5}}, 6},
                {new int[][] {{0,5},{0,5}}, 0},
                {new int[][] {}, 0},
                {new int[][] {{8,0}}, 8}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void solve(int[][] questions, int expected) {
        assertEquals(expected, new SolveWithBrainpower().mostPoints(questions));
    }
}