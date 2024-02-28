package com.company.leetcode.structures;

/**
 LC513. Find Bottom Left Tree Value
 Given the root of a binary tree, return the leftmost value in the last row of the tree.

 Example 1
 Input: root = [2,1,3]
 Output: 1

 Example 2:
 Input: root = [1,2,3,4,null,5,6,null,null,7]
 Output: 7

 Idea: Get the left in the deepest leaf
 */
public class BottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        int[] result = new int[]{0, 0};
        help(root, 1, result);
        return result[1];
    }

    private void help(TreeNode node, int currD, int[] result) {
        if (node == null) {
            return;
        }

        // If we have reached a new level
        if (currD > result[0]) {
            result[0] = currD;
            result[1] = node.val;
        }

        // Explore left and right subtrees
        help(node.left, currD + 1, result);
        help(node.right, currD + 1, result);
    }

}
