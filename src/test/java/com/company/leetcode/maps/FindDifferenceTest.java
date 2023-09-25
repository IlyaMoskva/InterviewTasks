package com.company.leetcode.maps;

import com.company.leetcode.Atoi;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class FindDifferenceTest {
    static Object[][] data() {
        return new Object[][]{
                new Object[]{"test", "setso", 'o'},
                new Object[]{"", "a", 'a'},
                new Object[]{"aaab", "aabba", 'b'}
        };
    }
    @ParameterizedTest
    @MethodSource("data")
    void findTheDifference(String s, String t, char expected) {
        assertEquals(expected, new FindDifference().findTheDifference(s, t));
    }
}