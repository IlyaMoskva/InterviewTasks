package com.company.leetcode;

import com.company.leetcode.structures.ListNode;

/**
 * LC 1721. Swapping Nodes in a Linked List
 You are given the head of a linked list, and an integer k.

 Return the head of the linked list after swapping the values of the
 kth node from the beginning and the kth node from the end (the list is 1-indexed).

 Example 1:
 Input: head = [1,2,3,4,5], k = 2
 Output: [1,4,3,2,5]

 Example 2:
 Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
 Output: [7,9,6,6,8,7,3,0,9,5]
 */
public class SwappingNodes {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = null;
        ListNode node = head;
        int counter = 0;
        int size = 0;
        while (node != null) {
            counter++;
            if (counter == k)
               first = node; // 1 for real head, here is pointer
            node = node.next;
        }
        size = counter;
        // Now in counter we have length
        if (k>size) return head;
        int last_counter = 0;

        node = head;
        while (last_counter < size-k) {
            last_counter++;
            node = node.next;
        }
        int stored = node.val;
        node.val = first.val;
        first.val = stored;
        return head;
    }
}
