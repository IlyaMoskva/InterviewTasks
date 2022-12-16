package com.company.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharTest {

    public static Object[][] data() {
        return new Object[][] {
                new Object [] {4, "babad"},
                new Object [] {0, "leetcode"},
                new Object [] {-1, ""},
                new Object [] {0, "a"},
                new Object [] {2, "loveleetcode"},
                new Object [] {-1, "aabb"}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void firstUniqeChar(int expected, String given) {
        assertEquals(expected, new FirstUniqueChar().firstUniqeChar(given) );
    }
}