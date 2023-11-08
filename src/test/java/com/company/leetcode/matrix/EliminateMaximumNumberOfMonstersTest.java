package com.company.leetcode.matrix;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class EliminateMaximumNumberOfMonstersTest {

    EliminateMaximumNumberOfMonsters shot = new EliminateMaximumNumberOfMonsters();

    public static Object[][] data() {
        return new Object[][] {
                new Object [] {3, new int[] {6,1,3,4,5},new int[] {3,1,1,1,2}},
                new Object [] {3, new int[] {1,3,4},new int[] {1,1,1}},
                new Object [] {1, new int[] {1,1,2,3},new int[] {1,1,1,1}},
                new Object [] {1, new int[] {3,2,4},new int[] {5,3,2}},
                new Object [] {2, new int[] {4,2,8},new int[] {2,1,4}},
                new Object [] {1, new int[] {3,2,4},new int[] {5,3,2}},
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void eliminateMaximum(int numberOfShots, int[] distance, int[] speed) {
        assertEquals(numberOfShots, shot.eliminateMaximum(distance, speed));
    }

    @Test
    void numSteps() {
        int[] dist = new int[]{1,3,4,5};
        int[] speed = new int[]{1,1,1,2};
        int[] expected = new int[]{1,3,4,3};
        for (int i=0;i<dist.length;i++)
            assertEquals(expected[i], shot.numSteps(dist[i], speed[i]));
    }

}