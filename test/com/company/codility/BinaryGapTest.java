package com.company.codility;

import com.company.codility.BinaryGap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    @Test
    void solution() {
        BinaryGap gap = new BinaryGap();
        assertEquals(0, gap.solution(0));
        assertEquals(0, gap.solution(4));
        assertEquals(0, gap.solution(32));
        assertEquals(0, gap.solution(1024));
        assertEquals(0, gap.solution(Integer.MAX_VALUE / 2 + 1));
        assertEquals(0, gap.solution(Integer.MAX_VALUE));
        assertEquals(1, gap.solution(80));
        assertEquals(4, gap.solution(66));
    }
}