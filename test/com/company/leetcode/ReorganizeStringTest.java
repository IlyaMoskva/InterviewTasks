package com.company.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ReorganizeStringTest {

    public static Object[][] data() {
        return new Object[][] {
                //new Object [] {"aba", "aab"},
                //new Object [] {"ababab", "aaabbb"},
                new Object [] {"vlvov", "vvvlo"},
                new Object [] {"", "aaab"}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void reorganizeString(String expected, String given) {
        ReorganizeString rs = new ReorganizeString();

        assertEquals(expected, rs.reorganizeString(given));
    }
}