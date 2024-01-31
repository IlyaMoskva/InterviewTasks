package com.company.leetcode.structures;

import java.util.LinkedList;
import java.util.List;

/**
 LC 1161. Maximum Level Sum of a Binary Tree
 Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.

 Return the smallest level x such that the sum of all the values of nodes at level x is maximal.

 Example 1:
 Input: root = [1,7,0,7,-8,null,null]
 Output: 2
 Explanation:
 Level 1 sum = 1.
 Level 2 sum = 7 + 0 = 7.
 Level 3 sum = 7 + -8 = -1.
 So we return the level with the maximum sum which is level 2.

 Example 2:
 Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
 Output: 2
 */
public class MaxLevelSumTree {
    public int maxLevelSum(TreeNode root) {
        int maxSum = root.val;
        int minLevel = 1;
        int level = 1;
        List<TreeNode> qOut = new LinkedList<>();
        qOut.add(root);
        while (!qOut.isEmpty()) {
            int currentSum = 0;
            List<TreeNode> q = new LinkedList<>(qOut);
            qOut.clear();
            while (!q.isEmpty()) {
                TreeNode node = q.remove(0);
                currentSum += node.val;
                if (node.left != null) qOut.add(node.left);
                if (node.right != null) qOut.add(node.right);
            }
            if (maxSum < currentSum) {
                minLevel = level;
                maxSum = currentSum;
            }
            level++;
        }
        return minLevel;
    }

}
