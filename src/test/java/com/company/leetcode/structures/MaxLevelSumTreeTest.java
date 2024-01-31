package com.company.leetcode.structures;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MaxLevelSumTreeTest {
    public static Object[][] data() {
        return new Object[][]{
                new Object[]{new Integer[] {1,7,0,7,-8,null,null}, 2},
                new Object[]{new Integer[] {3}, 1},
                new Object[]{new Integer[] {989,null,10250,98693,-89388,null,null,null,-32127}, 2},
                new Object[]{new Integer[] {2,null,5}, 2}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void maxLevelSumTest(Integer[] given, int expected) {
        TreeNode root = new TreeNode(given);
        assertEquals(expected, new MaxLevelSumTree().maxLevelSum(root));
    }

}