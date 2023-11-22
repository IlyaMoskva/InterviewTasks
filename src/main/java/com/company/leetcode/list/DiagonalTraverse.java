package com.company.leetcode.list;

import java.util.ArrayList;
import java.util.List;

/**
 LC 1424. Diagonal Traverse II
 Given a 2D integer array nums, return all elements of nums in diagonal order.

 Ex 1:
 Input: nums = [[1,2,3],[4,5,6],[7,8,9]]
 Output: [1,4,2,7,5,3,8,6,9]

 Ex2:
 Input: nums = [[1,2,3,4,5],[6,7],[8],[9,10,11],[12,13,14,15,16]]
 Output: [1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16]

 Idea:
 The problem involves traversing a 2D array diagonally and returning the elements in diagonal order.
 To achieve this, we can create a mapping of the diagonal sums and store the elements belonging to each sum.
 Finally, we'll extract the elements from the mapping in reverse order to get the diagonal order.
 */
public class DiagonalTraverse {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int m = nums.size(), maxSum = 0, size = 0, index = 0;
        List<Integer>[] map = new ArrayList[100001];
        for (int i = 0; i < m; i++) {
            size += nums.get(i).size();
            for (int j = 0; j < nums.get(i).size(); j++) {
                int sum = i + j;
                if (map[sum] == null) map[sum] = new ArrayList<>();
                map[sum].add(nums.get(i).get(j));
                maxSum = Math.max(maxSum, sum);
            }
        }
        int[] res = new int[size];
        for (int i = 0; i <= maxSum; i++) {
            List<Integer> cur = map[i];
            for (int j = cur.size() - 1; j >= 0; j--) {
                res[index++] = cur.get(j);
            }
        }
        return res;
    }
}
