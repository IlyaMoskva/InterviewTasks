package com.company.leetcode;

import com.company.leetcode.structures.GraphLimitedDistance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class GraphLimitedDistanceTest {

    public static Object[][] data() {
        return new Object[][] {
            new Object[] {new boolean[] {false, true}, 3, new int[][] {{0,1,2},{1,2,4},{2,0,8},{1,0,16}}, new int[][] {{0,1,2},{0,2,5}} },
            new Object[] {new boolean[] {true, false}, 5, new int[][] {{0,1,10},{1,2,5},{2,3,9},{3,4,13}}, new int[][] {{0,4,14},{1,4,13}} }
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(boolean[] expected, int n, int[][] edgeList, int[][] queries) {
        assertArrayEquals(expected, new GraphLimitedDistance().distanceLimitedPathsExist(n, edgeList, queries));
    }
}