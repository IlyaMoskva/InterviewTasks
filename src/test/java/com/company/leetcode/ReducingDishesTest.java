package com.company.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ReducingDishesTest {

    ReducingDishes rd = new ReducingDishes();
    public static Object[][] volumes() {
        return new Object[][] {
                new Object [] {14, new int[] {-1,-8,0,5,-9}},
                new Object [] {20, new int[] {4,3,2}},
                new Object [] {0, new int[] {-1,-2,-1}}
        };
    }

    @ParameterizedTest
    @MethodSource("volumes")
    void satisfy(int expected, int[] given) {
        assertEquals(expected, rd.satisfy(given));
    }
}