package com.company.leetcode.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class BagOfTokensTest {
    public static Object[][] data() {
        return new Object[][]{
                new Object[]{new int[] {100}, 50, 0},
                new Object[]{new int[] {200,100}, 150, 1},
                new Object[]{new int[] {100,200,300,400}, 200, 2}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void bagOtTokensTest(int[] tokens, int power, int expected) {
        assertEquals(expected, new BagOfTokens().bagOfTokensScore(tokens, power));
    }

}