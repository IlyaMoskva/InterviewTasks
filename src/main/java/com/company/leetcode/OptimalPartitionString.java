package com.company.leetcode;

import java.util.HashSet;

/**
 * 2405. Optimal Partition of String
 * Given a string s, partition the string into one or more substrings such that the characters in each substring are unique.
 * That is, no letter appears in a single substring more than once.
 * Return the minimum number of substrings in such a partition.
 * Note that each character should belong to exactly one substring in a partition.

 * Example 1:
 * Input: s = "abacaba"
 * Output: 4
 * Explanation:
 * Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
 * It can be shown that 4 is the minimum number of substrings needed.

 * Example 2:
 * Input: s = "ssssss"
 * Output: 6
 * Explanation:
 * The only valid partition is ("s","s","s","s","s","s").
 */
public class OptimalPartitionString {
    public int partitionString(String s) {
        if (s.isEmpty()) return 0;
        HashSet current = new HashSet<>();
        int sum = 1;
        for (char c: s.toCharArray())
        {
            if (current.contains(c)) {
                sum++;
                current.clear();
                current.add(c);
            } else {
                current.add(c);
            }
        }
        return sum;
    }
}
