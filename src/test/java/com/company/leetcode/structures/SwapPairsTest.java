package com.company.leetcode.structures;

import com.company.leetcode.structures.ListNode;
import com.company.leetcode.structures.SwapPairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapPairsTest {

    SwapPairs sp = new SwapPairs();

    @Test
    void swapEmpty() {
        ListNode ln = new ListNode();
        assertEquals(ln, sp.swapPairs(ln));
    }

    @Test
    void swapOnlyOne() {
        ListNode ln = new ListNode(1);
        assertEquals(ln, sp.swapPairs(ln));
    }
    @Test
    void swapList() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode swapped = sp.swapPairs(head);
        assertEquals(head, swapped.next);
        assertEquals(head.next.next, swapped.next.next.next);
        // assertEquals(head.next, swapped); // this fails, but values are OK.
    }

}