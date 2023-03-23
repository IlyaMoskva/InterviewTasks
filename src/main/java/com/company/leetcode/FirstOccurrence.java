package com.company.leetcode;

/**
 * LeetCode 28: Find the Index of the First Occurrence in a String
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 *
 * Example 2:
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class FirstOccurrence {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        if (hLen == 0 || nLen == 0 || nLen > hLen) return -1;
        int position = 0;
        while (position <= hLen - nLen) {
            if (checkStrs(haystack, needle, position)) return position;
            position++;
        }
        return -1;
    }

    public boolean checkStrs(String source, String query, int position) {
        for (int i=0; i<query.length(); i++) {
            if (source.charAt(position + i) != query.charAt(i))
                return false;
        }
        return true;
    }

}
