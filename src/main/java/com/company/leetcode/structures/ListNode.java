package com.company.leetcode.structures;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode(int[] vals) {
        this.val = vals[0];
        ListNode head = this;
        for (int i = 1; i < vals.length; i++) {
            head.next = new ListNode(vals[i]);
            head = head.next;
        }
    }

    public void log() {
        ListNode node = this;
        while (node != null) {
            System.out.print("[" + node.val + "] ");
            node = node.next;
        }
        System.out.println();
    }
}
