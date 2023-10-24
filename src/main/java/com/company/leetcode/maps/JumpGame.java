package com.company.leetcode.maps;

import java.util.HashSet;
import java.util.Set;

/**
 * LC 55: Jump Game
 * You are given an integer array nums. You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 * Return true if you can reach the last index, or false otherwise.
 */
public class JumpGame {
    Set visited = new HashSet();
    public boolean canJump(int[] nums) {
        return isFinish(nums, 0);
    }

    public boolean isFinish(int[] nums, int position) {
        if (visited.contains(position)) {
            return false;
        }
        visited.add(position);

        if (position >= nums.length - 1) {
            return true;
        }
        if (nums[position] == 0) {
            return false;
        }
        for (int i = 1; i <= nums[position]; i++) {
            if (isFinish(nums, position + i)) {
                return true;
            }
        }
        return false;
    }
}
