package com.company.leetcode.list;

import com.company.leetcode.list.LastStoneWeight;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {

    LastStoneWeight lsw = new LastStoneWeight();
    public static Object[][] data() {
        return new Object[][]{
                new Object[]{1, new int[]{2, 7, 4, 1, 8, 1}},
                new Object[]{1, new int[]{3, 2, 1, 1, 4}},
                new Object[]{2, new int[]{1, 3}},
                new Object[]{1, new int[]{1}},
                new Object[]{0, new int[]{2,2}},
                new Object[]{3, new int[]{7,6,7,6,9}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void lastStoneWeight(int expected, int[] stones) {
        assertEquals(expected, lsw.lastStoneWeight(stones));
    }
}