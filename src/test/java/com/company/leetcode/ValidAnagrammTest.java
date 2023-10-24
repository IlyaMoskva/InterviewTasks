package com.company.leetcode;

import com.company.leetcode.strings.ValidAnagramm;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagrammTest {

    public static Object[][] data() {
        return new Object[][]{
                {"anagram", "nagaram", true},
                {"rat", "car", false},
                {"", "", true},
                {"", "a", false},
                {"a", "", false},
                {"a", "a", true}
        };

    }
    @ParameterizedTest
    @MethodSource("data")
    void isAnagram(String s, String t, boolean expected) {
        assertEquals(expected, new ValidAnagramm().isAnagram(s, t));
    }
}