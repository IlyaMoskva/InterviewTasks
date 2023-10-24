package com.company.leetcode.strings;

/**
 * 387. First Unique Character in a String
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *
 * Example 1:
 *
 * Input: s = "leetcode"
 * Output: 0

 * Example 2:
 *
 * Input: s = "loveleetcode"
 * Output: 2

 * Example 3:
 *
 * Input: s = "aabb"
 * Output: -1
 */
public class FirstUniqueChar {

    public int firstUniqeChar(String s) {
        if (s.length() == 0) return -1;
        if (s.length() == 1) return 0;
        int[] indexes = new int[26];

        for (int i=0; i< s.length(); i++) {
            indexes[s.charAt(i)-'a']++;
        }

        for (int i=0; i< s.length(); i++) {
            if (indexes[s.charAt(i)-'a'] == 1)
            return i;
        }
        return -1;
    }
}
