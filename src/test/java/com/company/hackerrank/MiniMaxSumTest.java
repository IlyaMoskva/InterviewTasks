package com.company.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiniMaxSumTest {

    @Test
    public void minMaxTest() {
        MiniMaxSum sum = new MiniMaxSum(List.of(1, 2, 3, 4, 5));

        assertEquals(14, sum.getMaxVal());
        assertEquals(10, sum.getMinVal());
    }
}