package com.company.leetcode.numbers;

/**
 LC 26: Remove Duplicates from Sorted Array
 Given an integer array nums sorted in non-decreasing order,
 remove the duplicates in-place such that each unique element appears only once.
 The relative order of the elements should be kept the same.
 Then return the number of unique elements in nums.

 Consider the number of unique elements of nums to be k,
 to get accepted, you need to do the following things:

 Change the array nums such that the first k elements of nums contain the unique elements
 in the order they were present in nums initially.
 The remaining elements of nums are not important as well as the size of nums.
 Return k.
 */
public class RemoveDupesFromArray {
    public int removeDuplicates(int[] nums) {
        int cur = 1;
        int next = 1;
        while (next<nums.length) {
            if (nums[next]==nums[cur-1]) next++;
            else {
                nums[cur] = nums[next];
                cur++;
            }
        }
        return cur;
    }
}
