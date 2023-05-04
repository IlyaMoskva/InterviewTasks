package com.company.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class Dota2SenatTest {
    static Object[][] data() {
        return new Object[][]{
                new Object[]{"RDD", "Dire"},
                new Object[]{"RD", "Radiant"},
                new Object[]{"RRDDD", "Dire"},
                new Object[]{"D", "Dire"},
                new Object[]{"R", "Radiant"}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void predictPartyVictory2Test(String s, String expected) {
        assertEquals(expected, new Dota2Senat().predictPartyVictory2(s));
    }

}