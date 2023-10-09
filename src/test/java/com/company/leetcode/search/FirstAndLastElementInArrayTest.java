package com.company.leetcode.search;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastElementInArrayTest {

    FirstAndLastElementInArray flElement = new FirstAndLastElementInArray();
    static Object[][] data() {
        return new Object[][]{
                {new int[]{3,4}, new int[]{5,7,7,8,8,10}, 8},
                {new int[]{1,1}, new int[]{5,7,10}, 7},
                {new int[]{0,1}, new int[]{5,5,10}, 5},
                {new int[]{1,2}, new int[]{5,10,10}, 10},
                {new int[]{0,2}, new int[]{10,10,10}, 10},
                {new int[]{-1,-1}, new int[]{5,7,7,8,8,10}, 6},
                {new int[]{-1,-1}, new int[]{}, 0},
                {new int[]{0,0}, new int[]{1}, 1}
        };
    }
    @ParameterizedTest
    @MethodSource("data")
    public void searchRangeTest(int[] expected, int[] given, int target) {
        Assert.assertArrayEquals(expected, flElement.searchRange(given, target));
    }
}