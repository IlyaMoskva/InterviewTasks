package com.company.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountFactorsTest {

    CountFactors cf = new CountFactors();

    @Test
    void colutionTest() {
        assertEquals(8, cf.solution(24));
        assertEquals(3, cf.solution(9));
        assertEquals(1, cf.solution(1));
        assertEquals(0, cf.solution(Integer.MAX_VALUE));
    }

}