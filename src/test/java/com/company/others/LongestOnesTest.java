package com.company.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestOnesTest {

    @Test
    void verifyEmptySolution() {
        LongestOnes lo = new LongestOnes();
        assertEquals(0, lo.solution(new int[0]));
    }

    @Test
    void verifyZeroOnlySolution() {
        LongestOnes lo = new LongestOnes();
        assertEquals(0, lo.solution(new int[]{0, 0, 0, 0}));
    }

    @Test
    void verifyOrdinarySolution() {
        LongestOnes lo = new LongestOnes();
        assertEquals(2, lo.solution(new int[]{0, 1, 0, 1}));
        assertEquals(4, lo.solution(new int[]{0, 1, 0, 1, 1, 1}));
        assertEquals(4, lo.solution(new int[]{1, 1, 1, 1}));
        assertEquals(5, lo.solution(new int[]{0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1}));
    }

}