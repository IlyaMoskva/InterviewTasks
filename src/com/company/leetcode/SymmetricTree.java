package com.company.leetcode;

/**
 * LC 101. Symmetric Tree
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 * Beats 100% by time and 49 by memory
 */
public class SymmetricTree {
    
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        else
           return compare(root.left, root.right);
    }

    boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null ^ right == null) return false;
        if (left.val == right.val)
            return compare(left.left, right.right) && compare(left.right, right.left);
        else return false;
    }
}
