package com.company.leetcode;

import com.company.leetcode.maps.JumpGame;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    JumpGame jg = new JumpGame();

    public static Object[][] data() {
        return new Object[][] {
                new Object [] {true, new int[] {2,3,1,1,4}},
                new Object [] {false, new int[] {3,2,1,0,4}},
                new Object [] {false, new int[] {0, 3}},
                new Object [] {true, new int[] {0}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void canJump(boolean expected, int[] nums) {
        assertEquals(expected, jg.canJump(nums));
    }
}