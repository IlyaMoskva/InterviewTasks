package com.company.codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ChocolatesByNumbersTest {
    ChocolatesByNumbers c = new ChocolatesByNumbers();

    public static int[][] dataProviderChoco() {
        return new int[][] {
                new int[] {10, 4, 5},
                new int[] {5, 1, 5},
                new int[] {9, 3, 3},
                new int[] {1, 2, 1}
        };
    }

    @ParameterizedTest
    @MethodSource("dataProviderChoco")
    void verifySolution(int[] tst) {
        assertEquals(tst[2], c.solution(tst[0], tst[1]));
    }
}