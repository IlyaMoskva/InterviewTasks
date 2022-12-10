package com.company.leetcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    TrappingRainWater trapper = new TrappingRainWater();

    public static Object[][] volumes() {
        return new Object[][] {
                new Object [] {6, new int[] {0,1,0,2,1,0,1,3,2,1,2,1}},
                new Object [] {9, new int[] {4,2,0,3,2,5}},
                new Object [] {0, new int[] {1,2,1}},
                new Object [] {0, new int[] {8,5}}
        };
    }

    @ParameterizedTest
    @MethodSource("volumes")
    void trap(int expected, int[] given) {
        Assert.assertEquals(expected, trapper.trap(given) );
    }
}