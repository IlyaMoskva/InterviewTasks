package com.company.leetcode.strings;

import com.company.leetcode.strings.LongestPalindromicSubstring;
import org.junit.Assert;
import org.junit.jupiter.params.provider.MethodSource;

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