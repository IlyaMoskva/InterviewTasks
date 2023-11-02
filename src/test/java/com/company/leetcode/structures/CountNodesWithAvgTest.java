package com.company.leetcode.structures;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class CountNodesWithAvgTest {

    CountNodesWithAvg target = new CountNodesWithAvg();
    public static Object[][] data() {
        return new Object[][]{
                new Object[]{new Integer[] {4,8,5,0,1,null,6}, 5},
                new Object[]{new Integer[] {3}, 1},
                new Object[]{new Integer[] {2,2,2}, 3},
                new Object[]{new Integer[] {2,null,5}, 1}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void countNodesWithAvgOfSubtreeTest(Integer[] given, int expected) {
        TreeNode root = new TreeNode(given);
        Assert.assertEquals(expected, target.averageOfSubtree(root));
    }

}