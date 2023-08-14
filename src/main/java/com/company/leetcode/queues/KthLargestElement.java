package com.company.leetcode.queues;

import java.util.Comparator;
import java.util.Optional;
import java.util.PriorityQueue;

/**
 * LC 215. Kth Largest Element in an Array

 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * Can you solve it without sorting?

 * Example 1:
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5

 * Example 2:
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 */
public class KthLargestElement {
    static class DescComparatorLE implements Comparator<Integer> {
        @Override
        public int compare(Integer s1, Integer s2) {
            if (s1 < s2)
                return 1;
            else if (s1 > s2)
                return -1;
            return 0;
        }
    }
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, new DescComparatorLE());
        for (int i: nums) {
            pq.add(i);
        }
        for (int i = 1; i<k; i++)
            pq.poll();

        return pq.poll().intValue();
    }
}
