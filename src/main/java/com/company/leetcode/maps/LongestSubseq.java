package com.company.leetcode.maps;

import java.util.Arrays;

/**
 LC 300. Longest Increasing Subsequence
 Given an integer array nums, return the length of the longest strictly increasing
 subsequence
 */
public class LongestSubseq {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        int max = 0;
        for(int num:nums) {
            int i = Arrays.binarySearch(dp,0,max,num);
            if(i<0){
                i = -(i+1);
            }
            dp[i] = num;
            if(i == max) max++;

        }
        return max;
    }
}
