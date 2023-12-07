package com.company.leetcode.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class BiggestOddInStringTest {
    public static Object[][] data() {
        return new Object[][] {
                new Object [] {"5", "52"},
                new Object [] {"", "leetcode"},
                new Object [] {"", ""},
                new Object [] {"35", "a35"},
                new Object [] {"34565", "d345dfs34565"},
                new Object [] {"111", "45df23rty111zx7s5"},
                new Object [] {"7542351161", "7542351161"}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void largestOddNumberTest(String expected, String given) {
        assertEquals(expected, new BiggestOddInString().largestOddNumber(given) );
    }
}