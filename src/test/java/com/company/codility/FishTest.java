package com.company.codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {
    private Fish fish = new Fish();

    public static Object [][] fishes() {
        return new Object [][] {
                new Object [] { new int[] { 4, 3, 2, 1, 5 }, new int[] {  0, 1, 0, 0, 0 }, 2 },
                new Object [] { new int[] {       1, 2, 3 }, new int[] {        0, 0, 1 }, 3 },
                new Object [] { new int[] {    1, 2, 3, 4 }, new int[] {     1, 0, 0, 1 }, 3 },
        };
    }

    @ParameterizedTest
    @MethodSource("fishes")
    void fishTest(int[] A, int[] B, int expRes) {
        assertEquals(expRes, fish.solution(A, B));
    }
}