package com.company.leetcode.list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SummaryRangersTest {

    SummaryRangers sr = new SummaryRangers();

    static Object[][] data()  {
            return new Object[][]
            {
                new Object[] {new int[] {0, 1, 2, 4, 5, 7}, new String[] {"0->2", "4->5", "7"}},
                new Object[] {new int[] {0,2,3,4,6,8,9}, new String[] {"0","2->4","6","8->9"}}
            };
        };

    @ParameterizedTest
    @MethodSource("data")
    void test(int[] nums, String[] expected) {
        assertArrayEquals(expected, sr.summaryRanges(nums).toArray());
    }
}