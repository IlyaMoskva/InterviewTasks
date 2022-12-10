package com.company.leetcode;

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
