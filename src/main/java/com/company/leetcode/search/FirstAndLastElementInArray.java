package com.company.leetcode.search;

/**
 * LC34: Find First and Last Position of Element in Sorted Array
 * Given an array of integers nums sorted in non-decreasing order,
 * find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.

 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 * Input: nums = [], target = 0
 * Output: [-1,-1]

 * Constraints:
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums is a non-decreasing array.
 * -109 <= target <= 109

 IDEA: use binary search
 */
public class FirstAndLastElementInArray {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid;
        while (l<=r) {
            mid = l + (r-l) / 2;
            System.out.println("l:"+l+", r:"+r + ", mid:" + mid);
            int current = nums[mid];
            if (current == target) {
                l = mid;
                r = mid;
                while (l > 0 && nums[l-1] == target ) l--;
                while (r < nums.length-1 && nums[r+1] == target ) r++;
                return new int[]{l,r};
            }
            if (current > target) {
                r = mid-1;
            } else if (current < target) {
                l = mid+ 1;
            }
        }
        return new int[]{-1,-1};
    }
}
