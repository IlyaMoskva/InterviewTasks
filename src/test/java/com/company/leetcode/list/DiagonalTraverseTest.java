package com.company.leetcode.list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalTraverseTest {

    DiagonalTraverse dt = new DiagonalTraverse();

    public static Object[][] data() {
        return new Object[][]{
                new Object[]{new int[]{9}, new int[][]{{9}}},
                new Object[]{new int[]{1,3,2,4}, new int[][]{{1,2},{3,4}}},
                new Object[]{new int[]{1,4,2,7,5,3,8,6,9}, new int[][]{{1,2,3},{4,5,6},{7,8,9}}},
                new Object[]{new int[]{1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16},
                        new int[][]{{1,2,3,4,5},{6,7},{8},{9,10,11},{12,13,14,15,16}}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testDiagonalTraverse(int[] expected, int[][]matrix) {
        List<List<Integer>> m = new ArrayList<>();
        for (int[] ints : matrix) {
            m.add(Arrays.stream(ints).boxed().toList());
        }
        assertArrayEquals(expected, dt.findDiagonalOrder(m));
    }
}