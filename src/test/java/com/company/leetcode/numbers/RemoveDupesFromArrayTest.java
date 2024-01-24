package com.company.leetcode.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDupesFromArrayTest {
    public static Object[][] data() {
        return new Object[][]{
                new Object[]{2, new int[]{1,1,2}},
                new Object[]{5, new int[]{0,0,1,1,1,2,2,3,3,4}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void removeDuplicatesTest(int expected, int[] given) {
        assertEquals(expected, new RemoveDupesFromArray().removeDuplicates(given));
    }

}