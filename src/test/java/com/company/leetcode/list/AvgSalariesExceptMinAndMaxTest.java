package com.company.leetcode.list;

import com.company.leetcode.list.AvgSalariesExceptMinAndMax;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class AvgSalariesExceptMinAndMaxTest {

    static Object[][] data() {
        return new Object[][] {
            new Object[] {new int[] {4000,3000,1000,2000}, 2500},
            new Object[] {new int[] {1000,2000,3000}, 2000}
        };
    }
    @ParameterizedTest
    @MethodSource("data")
    public void test(int[] input, double expected) {
        assertEquals(expected, new AvgSalariesExceptMinAndMax().average(input));
    }
}