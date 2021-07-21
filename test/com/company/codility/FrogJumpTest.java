package com.company.codility;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJumpTest {

    FrogJump fj = new FrogJump();

    @Test
    void verifySolution() {
        assertEquals(3, fj.solution(10, 85, 30));
        assertEquals(2, fj.solution(10, 70, 30));

        assertEquals(0, fj.solution(10, 10, 30));
        assertEquals(0, fj.solution(10, 5, 2));
        assertEquals(10, fj.solution(-100, 100, 20));
    }

}