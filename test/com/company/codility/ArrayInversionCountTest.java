package com.company.codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ArrayInversionCountTest {

    ArrayInversionCount aic = new ArrayInversionCount();

    public static Object[][] dpCounts() {
        return new Object[][] {
                new Object [] {4, new int[] {-1, 6, 3, 4, 7, 4}},
                new Object [] {3, new int[] {-1, 8, 3, 0}},
                new Object [] {0, new int[] {}}
        };
    }

    @ParameterizedTest
    @MethodSource("dpCounts")
    void solution(int expValue, int[] A) {
        assertEquals(expValue, aic.solution(A));
    }
}