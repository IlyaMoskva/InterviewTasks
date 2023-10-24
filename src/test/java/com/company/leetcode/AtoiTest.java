package com.company.leetcode;

import com.company.leetcode.strings.Atoi;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class AtoiTest {

    static Object[][] data() {
        return new Object[][]{
                new Object[]{"42", 42},
                new Object[]{"", 0},
                new Object[]{"   ", 0},
                new Object[]{"+1", 1},
                new Object[]{"   -42", -42},
                new Object[]{"   +42", 42},
                new Object[]{"   -00042", -42},
                new Object[]{"4193 with words", 4193},
                new Object[]{"words and 987", 0},
                new Object[]{"-91283472332", -2147483648},
                new Object[]{"3.14159", 3}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void myAtoi(String s, int expected) {
        assertEquals(expected, new Atoi().myAtoi(s));
    }

}