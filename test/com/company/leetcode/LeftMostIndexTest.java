package com.company.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class LeftMostIndexTest {

    LeftMostIndex lmi = new LeftMostIndex();
    public static Object[][] volumes() {
        return new Object[][] {
                new Object [] {3, new int[] {2,3,-1,8,4}},
                new Object [] {2, new int[] {1,-1, 4}},
                new Object [] {-1, new int[] {8,5}}
        };
    }

    @ParameterizedTest
    @MethodSource("volumes")
    void findMiddleIndex(int expected, int[] given) {
        assertEquals(expected, lmi.findMiddleIndex(given));
    }
}