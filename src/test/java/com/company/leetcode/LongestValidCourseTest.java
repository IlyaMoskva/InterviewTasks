package com.company.leetcode;

import com.company.leetcode.list.LongestValidCourse;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestValidCourseTest {
    static Object[][] data() {
        return new Object[][]{
                new Object[]{new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}},
                new Object[]{new int[]{2, 2, 1}, new int[]{1, 2, 1}},
                new Object[]{new int[]{2, 2, 2}, new int[]{1, 2, 3}},
                new Object[]{new int[]{1, 2, 3, 2}, new int[]{1, 2, 3, 3}},
                new Object[]{new int[]{3, 1, 5, 6, 4, 2}, new int[]{1, 1, 2, 3, 2, 2}},
                new Object[]{new int[]{3}, new int[]{1}}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void longestValidCourse(int[] input, int[] expected) {
        LongestValidCourse longestValidCourse = new LongestValidCourse();
        assertArrayEquals(expected, longestValidCourse.longestObstacleCourseAtEachPosition(input));
    }
}