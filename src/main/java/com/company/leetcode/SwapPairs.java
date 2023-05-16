package com.company.leetcode;

import com.company.leetcode.structures.ListNode;

/**
 * LC 24. Swap Nodes in Pairs
 Given a linked list, swap every two adjacent nodes and return its head.
 You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

 Example 1:
 Input: head = [1,2,3,4]
 Output: [2,1,4,3]

 Example 2:
 Input: head = []
 Output: []

 Example 3:
 Input: head = [1]
 Output: [1]
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        head.log();
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            current.next = second;
            first.next = second.next;
            second.next = first;
            current = current.next.next;
        }

        dummy.next.log();
        return dummy.next;
    }
}
