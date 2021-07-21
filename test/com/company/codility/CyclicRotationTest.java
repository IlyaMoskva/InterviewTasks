package com.company.codility;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CyclicRotationTest {
    private CyclicRotation solution;

    public static Object [][] createData1() {
        return new Object [][] {
            new Object [] { new int [] { 3, 8, 9,  7, 6 },  3,  new int [] {  9, 7, 6,  3, 8 } },
            new Object [] { new int [] {       0,  0, 0 },  1,  new int [] {        0,  0, 0 } },
            new Object [] { new int [] {    1, 2,  3, 4 },  4,  new int [] {     1, 2,  3, 4 } },

            //wrap around more than once
            new Object [] { new int [] {    1, 2,  3, 4 },  5,  new int [] {     4, 1,  2, 3 } },

            //wrap around more than once, with negative
            new Object [] { new int [] {   -1, 2, -3, 4 }, 10,  new int [] {    -3, 4, -1, 2 } },

            //wrap around > 10 times - same as rotate by 3 (99 mod 4 = 3)
            new Object [] { new int [] {   -1, 2, -3, 4 }, 99,  new int [] {    2, -3, 4, -1 } },

            //wrap around > 10 times - finish where it started
            new Object [] { new int [] {   -1, 2, -3, 4 }, 100,  new int [] {   -1, 2, -3, 4 } },
        };
    }

    @ParameterizedTest
    @MethodSource("createData1")
    public void verifySolution(int [] pA, int pK, int [] pExpectedRotatedA) {
        solution = new CyclicRotation();
        int [] actualRotatedA = solution.solution(pA, pK);
        assertEquals(pExpectedRotatedA.length, actualRotatedA.length);
        for(int i=0; i<pExpectedRotatedA.length; i++) {
            assertEquals(pExpectedRotatedA[i], actualRotatedA[i]);
        }
    }
}