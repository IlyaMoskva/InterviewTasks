package com.company.leetcode.maps;

import com.company.leetcode.numbers.AddNumbers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubseqTest {

    LongestSubseq ls = new LongestSubseq();
    public static Object[][] data() {
        return new Object[][]{
                new Object[]{4, new int[]{10,9,2,5,3,7,101,18}},
                new Object[]{4, new int[]{0,1,0,3,2,3}},
                new Object[]{1, new int[]{1,1,1,1,1}},
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void longestSubTest(int expected, int[] nums) {
        assertEquals(expected, ls.lengthOfLIS(nums));
    }
}