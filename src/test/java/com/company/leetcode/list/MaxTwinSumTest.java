package com.company.leetcode.list;

import com.company.leetcode.structures.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MaxTwinSumTest {

    MaxTwinSum mts = new MaxTwinSum();

    static Object[][] data() {
        return new Object[][] {
                new Object[] {10001, new ListNode(10000, new ListNode(1))},
                new Object[] {6, new ListNode(5, new ListNode( 4, new ListNode(2, new ListNode( 1))))},
                new Object[] {7, new ListNode(6, new ListNode( 4, new ListNode(2, new ListNode( 1))))},
                new Object[] {2, new ListNode(1, new ListNode( 1, new ListNode(1, new ListNode( 1))))},
                new Object[] {0, new ListNode(-1, new ListNode( 1, new ListNode(-1, new ListNode( 1))))},
                new Object[] {1, new ListNode(-1, new ListNode( -1, new ListNode(2, new ListNode( 1))))},
                new Object[] {5, new ListNode(-1, new ListNode( 3, new ListNode(2, new ListNode( 1))))},
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void getMaxTwinSumTest(int expected, ListNode head) {
        assertEquals(expected, mts.pairSum(head));
    }
}