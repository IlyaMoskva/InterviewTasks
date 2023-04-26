package com.company.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class AddNumbersTest {

    AddNumbers an = new AddNumbers();
    public static Object[][] data() {
        return new Object[][]{
            new Object[]{321, 6},
            new Object[]{38, 2},
            new Object[]{0, 0}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void addDigits(int num, int expected) {
        assertEquals(expected, an.addDigits(num));
    }
}