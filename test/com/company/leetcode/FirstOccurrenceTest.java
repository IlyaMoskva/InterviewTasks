package com.company.leetcode;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


class FirstOccurrenceTest {

    FirstOccurrence fo = new FirstOccurrence();

    public static Object[][] data() {
        return new Object[][] {
                new Object [] {0, "sadbutsad", "sad"},
                new Object [] {-1, "leetcode", "abba"},
                new Object [] {4, "leetabbar", "abba"},
                new Object [] {-1, "aa", "aabc"},
                new Object [] {0, "aabc", "aa"},
                new Object [] {0, "aabc", "aabc"},
                new Object [] {-1, "", "acndsaw"},
                new Object [] {1, "fd", "d"},
                new Object [] {-1, "", "da"},
                new Object [] {-1, "", ""},
                new Object [] {0, "a", "a"}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void longestPalindrome(int expected, String haystack, String needle) {
        Assert.assertEquals(expected, fo.strStr(haystack, needle));
    }
}