package com.company.leetcode.structures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiTreePreorderTraverseTest {
    BiTreePreorderTraverse tr = new BiTreePreorderTraverse();

    @Test
    public void traverseOne() {
        TreeNode root = new TreeNode(1);
        assertEquals("1", tr.tree2str(root));
    }

    @Test
    public void traverseNormalTree() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertEquals("1(2)(3)", tr.tree2str(root));
    }

    @Test
    public void traverseTreeWithHole() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        assertEquals("1(2(4))(3)", tr.tree2str(root));
    }

    @Test
    public void traverseTreeWithLeftHole() {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        assertEquals("1(2()(4))(3)", tr.tree2str(root));
    }
}