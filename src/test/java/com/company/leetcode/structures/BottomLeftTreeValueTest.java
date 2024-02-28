package com.company.leetcode.structures;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class BottomLeftTreeValueTest {
    public static Object[][] data() {
        return new Object[][]{
                new Object[]{new Integer[] {2,1,3}, 1},
                new Object[]{new Integer[] {0, null, -1}, -1},
                new Object[]{new Integer[] {2}, 2},
                new Object[]{new Integer[] {1,2,3,4,null,5,6,null,null,7}, 7},
                new Object[]{new Integer[] {1,2,3,4,null,5,6,9,null,null,7}, 9}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void maxLevelSumTest(Integer[] given, int expected) {
        TreeNode root = new TreeNode(given);
        assertEquals(expected, new BottomLeftTreeValue().findBottomLeftValue(root));
    }

}