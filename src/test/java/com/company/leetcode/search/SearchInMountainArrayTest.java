package com.company.leetcode.search;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SearchInMountainArrayTest {

    static Object[][] peakData() {
        return new Object[][]{
                {new int[]{0,1,0}, 1},
                {new int[]{0,1,2,1}, 2},
                {new int[]{0,1,2,3,5,4}, 4},
                {new int[]{3,5,1,0}, 1}
        };
    }

    static Object[][] searchData() {
        return new Object[][]{
                {new int[]{1,5,2}, 2, 2},
                {new int[]{0,1,0}, 3, -1},
                {new int[]{0,1,2,1}, 1, 1},
                {new int[]{0,1,2,3,5,8,5}, 5, 4},
                {new int[]{0,1,2,3,5,8,6}, 6, 6},
                {new int[]{0,5,1,0}, 5, 1},
                {new int[]{2,3,5,2,1,0}, 2, 0},
                {new int[]{2,3,5,2,1,0}, 3, 1},
                {new int[]{1,3,5,2,1,0}, 2, 3}
        };
    }
    @ParameterizedTest
    @MethodSource("peakData")
    public void searchPeakTest(int[] given, int expected) {
        SearchInMountainArray search = new SearchInMountainArray();
        MountainArray arr = new MountainArray(given);
        Assert.assertEquals(expected, search.findPeak(arr));
        Assert.assertTrue(100 > arr.getCount());
    }

    @ParameterizedTest
    @MethodSource("searchData")
    public void searchRangeTest(int[] given, int target, int expected) {
        SearchInMountainArray search = new SearchInMountainArray();
        MountainArray arr = new MountainArray(given);
        Assert.assertEquals(expected, search.findInMountainArray(target, arr));
        Assert.assertTrue(100 > arr.getCount());
    }
}