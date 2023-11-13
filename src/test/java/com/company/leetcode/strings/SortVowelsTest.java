package com.company.leetcode.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class SortVowelsTest {
    SortVowels sv = new SortVowels();

    public static Object[][] data() {
        return new Object[][] {
                new Object [] {"lEOtcede", "lEetcOde"},
                new Object [] {"", ""},
                new Object [] {"**********", "**********"},
                new Object [] {"****aaab*", "****aaab*"},
                new Object [] {"qwrt", "qwrt"}

        };
    }
    @ParameterizedTest
    @MethodSource("data")
    public void sortVowelsTest(String expected, String given) {
        assertEquals(expected, sv.sortVowels(given));
    }

}