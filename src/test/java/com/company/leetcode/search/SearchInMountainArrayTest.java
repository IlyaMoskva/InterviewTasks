package com.company.leetcode.search;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SearchInMountainArrayTest {

    static Object[][] data() {
        return new Object[][]{
                {new int[]{0,1,0}, 3, -1}
        };
    }
    @ParameterizedTest
    @MethodSource("data")
    public void searchRangeTest(int[] given, int target, int expected) {
        MountainArray arr = new MountainArray(given);
        Assert.assertEquals(expected, new SearchInMountainArray().findInMountainArray(target, arr));
    }
}