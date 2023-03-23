package com.company.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingElementsTest {

    @Test
    void solution() {
        CountingElements elements = new CountingElements();
        assertEquals(3, elements.solution(3, new int[]{1,2,1,3,5}));
        assertEquals(0, elements.solution(1, new int[]{1,2,1,3,5}));
        assertEquals(-1, elements.solution(5, new int[]{1,2,1,3,5}));
        assertEquals(-1, elements.solution(3, new int[]{1,2,1,2}));
        assertEquals(-1, elements.solution(5, new int[]{3}));
    }
}