package com.company.leetcode;

/**
 * LeetCode 42:
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 * Example:
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
 * In this case, 6 units of rain water (blue section) are being trapped.
 */

public class TrappingRainWater
{
    public int trap(int[] height) {
        if (height.length < 3) return 0;
        int lMax = height[0], rMax = height[height.length-1];
        int volume = 0;
        int l = 0, r = height.length - 1;
        while (l<r) {
            if (lMax > rMax) {
                r--;
                rMax = Math.max(height[r], rMax);
                volume += rMax - height[r];
            }
            else {
                l++;
                lMax = Math.max(height[l], lMax);
                volume += lMax - height[l];
            }

        }
        return volume;
    }

}
