package com.company.leetcode.list;

/**
 * You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line
 * are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container,
 * such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length <= 1) return 0;

        int volume = 0, current_volume;
        for (int i = 0; i < height.length - 1; i++) {
            if (height[i] == 0) continue;
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] == 0) continue;
                current_volume = (j-i) * Math.min(height[i], height[j]);
                if (current_volume > volume) {
                    volume = current_volume;
                }
            }
        }
        return volume;
    }

    public int optimizedMaxArea(int[] height) {
        if (height.length <= 1) return 0;

        int l = 0;
        int r = height.length-1;
        int volume = 0, current_volume;
        while (l < r) {
            current_volume = (r-l) * Math.min(height[l], height[r]);
            if (current_volume > volume) {
                volume = current_volume;
            }
            if ( height[l]< height[r] )
                l++;
            else
                r--;

        }
        return volume;
    }
}
