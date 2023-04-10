package com.company.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesTest {

    Parentheses p = new Parentheses();
    public static Object[][] data() {
        return new Object[][] {
                new Object [] {true, "()"},
                new Object [] {true, "({[]})"},
                new Object [] {false, "(["},
                new Object [] {false, "([)]"},
                new Object [] {false, "([]"},
                new Object [] {true, ""},
                new Object [] {false, ")("}
        };
    }
    @ParameterizedTest
    @MethodSource("data")
    void isValid(boolean expected, String given) {
        assertEquals(expected, p.isValid(given));
    }
}