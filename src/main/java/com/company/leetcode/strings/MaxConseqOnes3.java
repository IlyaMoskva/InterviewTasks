package com.company.leetcode.strings;

/**
 LC1004: Maximum Consecutive Ones III
 Given a binary array nums and an integer k,
 return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 Example 1:

 Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 Output: 6
 Explanation: [1,1,1,0,0,1,1,1,1,1,1]
 Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

 Example 2:

 Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
 Output: 10
 Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

 Idea: Sliding window
 */
public class MaxConseqOnes3 {
    public int longestOnes(int[] nums, int k) {
        int l = 0, res = 0, pointer = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                pointer++;
            }
            while (pointer > k) {
                if (nums[l] == 0)
                    pointer--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
