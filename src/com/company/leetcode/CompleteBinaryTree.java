package com.company.leetcode;

import com.company.leetcode.structures.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 958. Check Completeness of a Binary Tree
 * Given the root of a binary tree, determine if it is a complete binary tree.
 * -
 * In a complete binary tree, every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible.
 * It can have between 1 and 2h nodes inclusive at the last level h.
 */
public class CompleteBinaryTree {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null)
            return true;

        boolean nullNodeFound = false;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node != null && nullNodeFound) return false;
            if (node == null) {
                nullNodeFound = true;
            } else {
                q.offer(node.left);
                q.offer(node.right);
            }
        }
        return true;
    }
}
