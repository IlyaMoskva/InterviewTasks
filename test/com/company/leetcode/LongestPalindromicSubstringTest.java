package com.company.leetcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

    public static Object[][] data() {
        return new Object[][] {
                new Object [] {"aba", "babad"},
                new Object [] {"abba", "abba"},
                new Object [] {"aa", "aabc"},
                new Object [] {"", "acndsaw"},
                new Object [] {"d", "d"},
                new Object [] {"", "da"},
                new Object [] {"", ""}
        };
    }

    //@ParameterizedTest
    @MethodSource("data")
    void longestPalindrome(String expected, String given) {
        Assert.assertEquals(expected, lps.longestPalindrome(given));
    }
}