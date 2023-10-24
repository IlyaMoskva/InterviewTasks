package com.company.leetcode.structures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class BiggestNumbersInTreeRowTest {

    BiggestNumbersInTreeRow bn = new BiggestNumbersInTreeRow();
    public static Object[][] data() {
        return new Object[][]{
                new Object[]{new Integer[] {1,3,2,5,3, null,9}, new Integer[] {1,3,9}},
                new Object[]{new Integer[] {1,2,3}, new Integer[] {1,3}},
                new Object[]{new Integer[] {0}, new Integer[] {0}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void findBiggestNumberInRows(Integer[] tree, Integer[] expected) {
        TreeNode treeNode = new TreeNode(tree);
        Integer[] actual = bn.largestValues(treeNode).toArray(Integer[]::new);
        Assertions.assertArrayEquals(expected, actual);
    }
}