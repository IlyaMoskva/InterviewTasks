package com.company.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagTest {

    ZigZag z = new ZigZag();

    public static Object[][] values() {
        return new Object[][] {
                new Object [] {"PINALSIGYAHRPI", "PAYPALISHIRING", 4},
                new Object [] {"PAHNAPLSIIGYIR", "PAYPALISHIRING", 3},
                new Object [] {"ACB", "ABC", 2},
                new Object [] {"A", "A", 1},
                new Object [] {"ABC", "ABC", 10}
        };
    }

    @ParameterizedTest
    @MethodSource("values")
    void convert(String expected, String givenString, int numRows) {
        assertEquals(expected, z.convert(givenString, numRows));
    }
}