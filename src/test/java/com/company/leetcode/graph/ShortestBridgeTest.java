package com.company.leetcode.graph;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ShortestBridgeTest {
    
    ShortestBridge sb = new ShortestBridge();
    
    static Object[][] data() {
        return new Object[][] {
                {1, new int[][] {{0,1},{1,0}}},
                {1, new int[][] {{1,1,1,1,1},{1,0,0,0,1},{1,0,1,0,1},{1,0,0,0,1},{1,1,1,1,1}}},
                {2, new int[][] {{0,1,0},{0,0,0},{0,0,1}}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void shortestBridgeTest(int expected, int[][] grid) {
        //assertEquals(expected, sb.shortestBridge(grid));
    }
}