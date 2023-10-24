package com.company.leetcode;

import com.company.leetcode.strings.MaxVowels;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MaxVowelsTest {
    public static Object[][] data() {
        return new Object[][] {
                new Object [] {3, 3, "abciiidef"},
                new Object [] {2, 2, "aeiou"},
                new Object [] {2, 3, "leetcode"},
                new Object [] {0, 1, ""},
                new Object [] {0, 0, "kjasjabk"},
                new Object [] {0, 7, "hghwrwhgrwhg"},
                new Object [] {2, 2, "eaeaeeea"},
                new Object [] {8, 8, "eaeaeeea"},
                new Object [] {7, 8, "ebeaeeea"},
                new Object [] {6, 6, "veaeeea"},
                new Object [] {4, 7, "weallloveyou"}
        };
    }
    @ParameterizedTest
    @MethodSource("data")
    void maxVowelsTests(int expected, int k, String given) {
        assertEquals(expected, new MaxVowels().maxVowels(given, k));
    }
}