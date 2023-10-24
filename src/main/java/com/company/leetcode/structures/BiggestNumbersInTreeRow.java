package com.company.leetcode.structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LeetCode 515. Find Largest Value in Each Tree Row
 Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).

 Example 1:
 Input: root = [1,3,2,5,3,null,9]
 Output: [1,3,9]

 Example 2:
 Input: root = [1,2,3]
 Output: [1,3]

 Idea: Use BFS and every loop check maximum.
 */
public class BiggestNumbersInTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        if (root == null)
            return resultList;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int currMax = Integer.MIN_VALUE;
            int qLen = queue.size();

            for (int i = 0; i < qLen; i++) {
                TreeNode tempNode = queue.poll();
                currMax = Math.max(currMax, tempNode.val);
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
            resultList.add(currMax);
        }
        return resultList;
    }
}
