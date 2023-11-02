package com.company.leetcode.structures;

import com.company.leetcode.structures.ListNode;
import com.company.leetcode.structures.SwappingNodes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwappingNodesTest {

    SwappingNodes sn = new SwappingNodes();

    @Test
    void swapNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = sn.swapNodes(head, 2);
        assertEquals(1, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
    }

    @Test
    void swapNodesWithKMoreThanHalf() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = sn.swapNodes(head, 4);
        assertEquals(1, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
    }

    @Test
    void swapNodes_kIsBigger() {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode result = sn.swapNodes(head, 5);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
    }
    @Test
    void swapNodes_kIsSize() {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode result = sn.swapNodes(head, 2);
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
    }

    @Test
    void swapNodes_kIsOne() {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode result = sn.swapNodes(head, 1);
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
    }

    @Test
    void swapNodes_OnlyNode() {
        ListNode head = new ListNode(1);
        ListNode result = sn.swapNodes(head, 1);
        assertEquals(1, result.val);
    }
}