package com.company.leetcode.strings;

import com.company.leetcode.strings.LongestSubstringWORepeating;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


class LongestSubstringWORepeatingTest {

    LongestSubstringWORepeating lswr = new LongestSubstringWORepeating();
    public static Object[][] data() {
        return new Object[][] {
                new Object [] {3, "abca"},
                new Object [] {3, "abcabcbb"},
                new Object [] {3, "bacbacbb"},
                new Object [] {1, "bbbb"},
                new Object [] {3, "pwwkew"},
                new Object [] {4, "ffffffabccccccc"},
                new Object [] {0, ""},
                new Object [] {6, "@#$%^ ^&*("},
                new Object [] {10, " aAbB12345"},
                new Object [] {1, " "}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void lengthOfLongestSubstring(int expected, String given) {
        Assert.assertEquals(expected, lswr.lengthOfLongestSubstring(given));
    }
}