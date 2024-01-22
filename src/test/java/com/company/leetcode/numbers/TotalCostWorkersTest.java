package com.company.leetcode.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class TotalCostWorkersTest {
    public static Object[][] data() {
        return new Object[][]{
                new Object[]{11, 3, 4, new int[]{17,12,10,2,7,2,11,20,8}},
                new Object[]{4, 3, 3, new int[]{1,2,4,1}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void totalCostTest(double totalCost, int rounds, int candidates, int[] costs) {
        assertEquals(totalCost, new TotalCostWorkers().totalCost(costs, rounds, candidates));
    }

    @ParameterizedTest
    @MethodSource("data")
    public void totalCostTwoHeapsTest(double totalCost, int rounds, int candidates, int[] costs) {
        assertEquals(totalCost, new TotalCostWorkers().totalCostTwoHeaps(costs, rounds, candidates));
    }

    @ParameterizedTest
    @MethodSource("data")
    public void totalCostFastestTest(double totalCost, int rounds, int candidates, int[] costs) {
        assertEquals(totalCost, new TotalCostWorkers().totalCostFastest(costs, rounds, candidates));
    }

}