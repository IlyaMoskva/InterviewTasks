package com.company.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class OptimalPartitionStringTest {

    public static Object[][] data() {
        return new Object[][] {
                new Object [] {2, "babad"},
                new Object [] {2, "abba"},
                new Object [] {2, "aabc"},
                new Object [] {2, "acndsaw"},
                new Object [] {1, "d"},
                new Object [] {1, "da"},
                new Object [] {0, ""}
        };
    }

    OptimalPartitionString ops = new OptimalPartitionString();
    @ParameterizedTest
    @MethodSource("data")
    void partitionString(int expected, String given) {
        assertEquals(expected, ops.partitionString(given));
    }
}