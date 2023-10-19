package com.company.leetcode.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStringTest {

    public static Object[][] data() {
        return new Object[][] {
                new Object [] {"ab#c", "ac", true},
                new Object [] {"", "abc###", true},
                new Object [] {"vl#vov#", "vvv#l#o", true},
                new Object [] {"", "aaab", false},
                new Object [] {"ab##", "c#d#", true},
                new Object [] {"a#c", "b", false},
                new Object [] {"##a#c", "c", true},

        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void backspaceCompareTest(String s, String t, boolean expected) {
        BackspaceString rs = new BackspaceString();
        assertEquals(expected, rs.backspaceCompare(s,t));
    }

}