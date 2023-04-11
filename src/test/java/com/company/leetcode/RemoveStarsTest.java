package com.company.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class RemoveStarsTest {

    RemoveStars rs = new RemoveStars();

    public static Object[][] data() {
        return new Object[][] {
                new Object [] {"lecoe", "leet**cod*e"},
                new Object [] {"", "erase*****"},
                new Object [] {"", "erase**********"},
                new Object [] {"aaa", "****aaab*"}
        };
    }
    @ParameterizedTest
    @MethodSource("data")
    void removeStars(String expected, String given) {
        assertEquals(expected, rs.removeStars(given));
    }
}