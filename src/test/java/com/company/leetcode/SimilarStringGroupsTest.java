package com.company.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class SimilarStringGroupsTest {

    static Object[][] data() {
        return new Object[][]{
            {new String[]{"tars","rats","arts","star"}, 2},
            {new String[]{"omv","ovm"}, 1},
            {new String[]{"abc","abc","abd","abd"}, 1}
        };
    }

    static Object[][] similarData() {
        return new Object[][]{
            {"tars", "star", false},
            {"omv","ovm", true},
            {"abc","abc", true},
            {"", "", true}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void numSimilarGroups(String[] strs, int expected) {
        assertEquals(expected, new SimilarStringGroups().numSimilarGroups(strs));
    }

    @ParameterizedTest
    @MethodSource("similarData")
    void isSimilar(String str1, String str2, boolean expected) {
        assertEquals(expected, new SimilarStringGroups().isSimilar(str1, str2));
    }
}