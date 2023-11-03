package com.company.leetcode.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayWithStackOpsTest {

    BuildArrayWithStackOps listBuilder = new BuildArrayWithStackOps();

    static Object[][] data() {
        return new Object[][]{
                {new String[]{"Push", "Push"}, new int[]{1,2}, 4},
                {new String[]{"Push","Push","Pop","Push"}, new int[]{1,3}, 3},
                {new String[]{"Push", "Push", "Push"}, new int[]{1,2,3}, 3},
                {new String[]{}, new int[]{}, 0}
        };
    }
    @ParameterizedTest
    @MethodSource("data")
    public void searchRangeTest(String[] expected, int[] target, int n) {
        assertArrayEquals(expected, listBuilder.buildArray(target, n).toArray());
    }

}