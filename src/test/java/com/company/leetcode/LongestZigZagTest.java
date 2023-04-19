package com.company.leetcode;

import com.company.leetcode.structures.TreeNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestZigZagTest {

    LongestZigZag lzz = new LongestZigZag();

    public static Object[][] data() {
        return new Object[][] {
                new Object [] {3, new Integer[] {1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1}},
                new Object [] {4, new Integer[] {1,1,1,null,1,null,null,1,1,null,1}},
                new Object [] {0, new Integer[] {1}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void longestZigZag(int expected, Integer[] values) {
        assertEquals(expected, lzz.longestZigZag(new TreeNode(values)));
    }
}