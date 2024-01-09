package com.company.leetcode.structures;

import java.util.ArrayList;
import java.util.List;

/**
 LC872. Leaf-Similar Trees.
 Consider all the leaves of a binary tree,
 from left to right order, the values of those leaves form a leaf value sequence.
 For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 Two binary trees are considered leaf-similar if their leaf value sequence is the same.

 Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 */
public class LeafSimilarBT {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        traverse(root1, leaf1);
        traverse(root2, leaf2);
        return leaf1.equals(leaf2);
    }

    public void traverse(TreeNode root, List<Integer> leaves) {
        if (root == null) return;
        if (root.left == null && root.right == null) leaves.add(root.val);

        if (root.left != null) {
            traverse(root.left, leaves);
        }
        if (root.right != null) {
            traverse(root.right, leaves);
        }
    }
}
