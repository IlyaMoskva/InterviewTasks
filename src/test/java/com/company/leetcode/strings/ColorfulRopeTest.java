package com.company.leetcode.strings;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ColorfulRopeTest {
    ColorfulRope cr = new ColorfulRope();

    public static Object[][] data() {
        return new Object[][] {
                new Object [] {0, "asas", new int[] {1,2,3,4}},
                new Object [] {3, "abaac", new int[] {1,2,3,4,5}},
                new Object [] {2, "aabaa", new int[] {1,2,3,4,1}},
                new Object [] {0, "abc", new int[] {1,2,3}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void longestPalindrome(int expected, String colors, int[] neededTime) {
        Assert.assertEquals(expected, cr.minCost(colors, neededTime));
    }
}