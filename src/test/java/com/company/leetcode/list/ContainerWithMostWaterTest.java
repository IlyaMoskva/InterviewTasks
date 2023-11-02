package com.company.leetcode.list;

import com.company.leetcode.list.ContainerWithMostWater;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ContainerWithMostWaterTest {

    ContainerWithMostWater container = new ContainerWithMostWater();

    public static Object[][] volumes() {
        return new Object[][] {
                new Object [] {1, new int[] {1,1}},
                new Object [] {2, new int[] {1,2,1}},
                new Object [] {49, new int[] {1,8,6,2,5,4,8,3,7}},
                new Object [] {16, new int[] {4,3,2,1,4}}

        };
    }

    @Test
    void maxAreaWithZeroNoContainer() {
        Assert.assertEquals(0, container.maxArea(new int[] {}) );
        Assert.assertEquals(0, container.maxArea(new int[] {7}));
    }


    @ParameterizedTest
    @MethodSource("volumes")
    void maxArea(int expected, int[] given) {
        Assert.assertEquals(expected, container.maxArea(given) );
        Assert.assertEquals(expected, container.optimizedMaxArea(given) );
    }
}