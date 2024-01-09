package com.company.leetcode.structures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeafSimilarBTTest {

    LeafSimilarBT lsbt = new LeafSimilarBT();
    TreeNode given1 = new TreeNode(3, new TreeNode(5, new TreeNode(6),
            new TreeNode(2, new TreeNode(7), new TreeNode(4))),
            new TreeNode(1, new TreeNode(9), new TreeNode(8)));

    TreeNode given2 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(7)),
            new TreeNode(1, new TreeNode(4),
                    new TreeNode(2, new TreeNode(9),new TreeNode(8))));

    @Test
    public void testEqualsLeaves() {
        assertTrue(lsbt.leafSimilar(given1, given2));
    }
}