package com.company.leetcode.structures;

import com.company.leetcode.structures.SumRootToLeafNumbers;
import com.company.leetcode.structures.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumRootToLeafNumbersTest {

    SumRootToLeafNumbers rtl = new SumRootToLeafNumbers();

    @Test
    void dfs() {
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(0);
        tree.right = new TreeNode(3);

        assertEquals(103, rtl.sumNumbers(tree));
    }
}