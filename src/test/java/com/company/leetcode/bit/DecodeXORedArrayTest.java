package com.company.leetcode.bit;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class DecodeXORedArrayTest {

    static  Object[][] data() {
        return new Object[][] {
            new Object[]{new int[]{1,2,3}, 1, new int[]{1,0,2,1}},
            new Object[]{new int[]{6,2,7,3}, 4, new int[]{4,2,0,7,4}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void getDecodedArray(int[] encoded, int first, int[] expected) {
        Assert.assertArrayEquals(expected, new DecodeXORedArray().decode(encoded, first));
    }

}