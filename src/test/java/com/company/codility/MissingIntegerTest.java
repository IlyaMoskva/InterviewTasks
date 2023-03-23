package com.company.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    @Test
    void verifySolution() {
        MissingInteger mi = new MissingInteger();
        assertEquals(1, mi.solution(new int[]{-3,0,-1,-1}));
        assertEquals(4, mi.solution(new int[]{-3,2,1,-1,3}));
        assertEquals(3, mi.solution(new int[]{1,2,1,1,2,4}));
    }

}