package com.company.leetcode.bit;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class FindOriginalArrayWithXORTest {
    static  Object[][] data() {
        return new Object[][] {
            new Object[]{new int[]{5,2,0,3,1}, new int[]{5,7,2,3,2}},
            new Object[]{new int[]{6}, new int[]{6}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void getDecodedArray(int[] encoded, int[] expected) {
        Assert.assertArrayEquals(expected, new FindOriginalArrayWithXOR().findArray(encoded));
    }


}