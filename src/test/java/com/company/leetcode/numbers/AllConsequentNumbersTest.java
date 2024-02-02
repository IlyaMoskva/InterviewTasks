package com.company.leetcode.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllConsequentNumbersTest {
    public static Object[][] data() {
        return new Object[][]{
                new Object[]{new int[] {123, 234}, 100, 300},
                new Object[]{new int[] {1234,2345,3456,4567,5678,6789,12345}, 1000, 13000},
                new Object[]{new int[] {}, 10, 10},
                new Object[]{new int[] {12}, 10, 12}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void addDigits(int[] expected, int low, int high) {
        List<Integer> res = new AllConsequentNumbers().sequentialDigits(low, high);
        int[] actual = res.stream().mapToInt(Integer::intValue).toArray();
        assertArrayEquals(expected, actual);
    }

}