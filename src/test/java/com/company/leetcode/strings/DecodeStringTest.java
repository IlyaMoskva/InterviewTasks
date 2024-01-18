package com.company.leetcode.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {
    public static Object[][] data() {
        return new Object[][] {
                new Object [] {"aaabcbc", "3[a]2[bc]"},
                new Object [] {"accaccacc", "3[a2[c]]"},
                new Object [] {"accaccaccnn", "3[a2[c]]2[n]"},
                new Object [] {"abcabccdcdcdef", "2[abc]3[cd]ef"}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void decodeStringTest(String expected, String given) {
        assertEquals(expected, new DecodeString().decodeString(given));
    }
}