package com.company.leetcode.numbers;

import com.company.leetcode.numbers.AddTwoNumbers;
import com.company.leetcode.structures.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    static Object[][] data() {
        return new Object[][]{
                {new int[]{2, 4, 3}, new int[]{5, 6, 4}, new int[]{7, 0, 8}},
                {new int[]{0}, new int[]{0}, new int[]{0}},
                {new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9}, new int[]{8, 9, 9, 9, 0, 0, 0, 1}},
        };
    }
    @ParameterizedTest
    @MethodSource("data")
    void addTwoNumbers(int[] l1, int[] l2, int[] expected) {
        ListNode list1 = new ListNode(l1);
        ListNode list2 = new ListNode(l2);
        ListNode actual = new AddTwoNumbers().addTwoNumbers(list1, list2);

        for (int i=0; i<expected.length; i++) {
            assertEquals(expected[i], actual.val);
            actual = actual.next;
        }
    }
}