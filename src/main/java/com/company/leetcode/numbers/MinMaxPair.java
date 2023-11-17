package com.company.leetcode.numbers;

import java.util.Arrays;
import java.util.Collections;

/**
 * LC 1877. Minimize Maximum Pair Sum in Array
 */
public class MinMaxPair {
    public int minPairSum(int[] nums) {
        int minMaxSum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length /2; i++) {
            minMaxSum = Math.max(minMaxSum, nums[i] + nums[nums.length-i-1]);
        }
        return minMaxSum;
    }
}
