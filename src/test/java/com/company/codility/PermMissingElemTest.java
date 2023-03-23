package com.company.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {
    PermMissingElem me = new PermMissingElem();

    @Test
    void verifySolution() {
        assertEquals(4, me.solution(new int[]{1,2,3,5}));
        assertEquals(1, me.solution(new int[]{}));
        assertEquals(4, me.solution(new int[]{1,2,3}));
    }
}