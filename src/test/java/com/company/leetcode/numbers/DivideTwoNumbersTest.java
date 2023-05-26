package com.company.leetcode.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class DivideTwoNumbersTest {

    DivideTwoNumbers dtn = new DivideTwoNumbers();
    static Object[][] data() {

        return new Object[][]{
                {10, 3, 3},
                {7, -3, -2},
                {-2147483648, -1, 2147483647},
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int dividend, int divisor, int expected) {
        assertEquals(expected, dtn.divide(dividend, divisor));
    }

}