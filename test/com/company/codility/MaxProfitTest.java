package com.company.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {

    private MaxProfit mp = new MaxProfit();

    @Test
    void verifySolution() {
        assertEquals(356, mp.solution(new int[]{3171, 1011, 1123, 1366, 1013, 1367}));
        assertEquals(10, mp.solution(new int[]{5, 10, 5, 15, 4, 2, 5}));
    }
}