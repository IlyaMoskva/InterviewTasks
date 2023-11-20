package com.company.leetcode.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MinTimeToGarbageTest {

    MinTimeToGarbage mtg = new MinTimeToGarbage();

    public static Object[][] data() {
        return new Object[][]{
                new Object[]{21, new String[]{"G","P","GP","GG"}, new int[]{2,4,3}},
                new Object[]{37, new String[]{"MMM","PGM","GP"}, new int[]{3,10}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testMinTimeToCollectGarbage(int expected, String[] garbage, int[] travel) {
        assertEquals(expected, mtg.garbageCollection(garbage, travel));
    }

}