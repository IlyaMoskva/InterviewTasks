package com.company.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {
    LongestValidParentheses p = new LongestValidParentheses();
    public static Object[][] data() {
        return new Object[][] {
                new Object [] {2, "()"},
                new Object [] {0, "("},
                new Object [] {2, "())"},
                new Object [] {2, "(()"},
                new Object [] {4, "(()()"},
                new Object [] {4, "((())(((()"},
                new Object [] {2, "(()(((()"},
                new Object [] {2, "()("},
                new Object [] {4, ")()())"},
                new Object [] {2, "()(()"},
                new Object [] {6, "()(())"},
                new Object [] {6, "(()())"},
                new Object [] {0, ""},
                new Object [] {0, ")("}
        };
    }
    @ParameterizedTest
    @MethodSource("data")
    void isValid(int expected, String given) {
        assertEquals(expected, p.longestValidParentheses(given));
    }

}