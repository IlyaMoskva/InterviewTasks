package com.company.leetcode.structures;

import com.company.leetcode.structures.TreeNode;

/**
 * LeetCode 129. Sum Root to Leaf Numbers
 * You are given the root of a binary tree containing digits from 0 to 9 only.
 * Each root-to-leaf path in the tree represents a number.
 * For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
 * Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.
 * A leaf node is a node with no children.
 */
public class SumRootToLeafNumbers {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        dfs(root,"");
        return sum;
    }
    public void dfs(TreeNode root, String str){
        if (root == null){
            return;
        }
        str += root.val;
        if(root.left == null && root.right == null){
            sum += Integer.parseInt(str);
            return;
        }
        dfs(root.left, str);
        dfs(root.right, str);
    }
}
