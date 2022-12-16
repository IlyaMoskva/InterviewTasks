package com.company.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 767. Reorganize String
 *
 * Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
 * Return any possible rearrangement of s or return "" if not possible.
 *
 * Example 1:
 *
 * Input: s = "aab"
 * Output: "aba"
 *
 * Example 2:
 *
 * Input: s = "aaab"
 * Output: ""
 */
public class ReorganizeString {
    public String reorganizeString(String s) {
        if (s.length() < 2) return s;
        Set<Integer> movedSymbols = new HashSet<>();
        StringBuilder res = new StringBuilder().append(s.charAt(0));

        int p1 = 1;
        while (p1 < s.length()- movedSymbols.size()) {
            if (movedSymbols.contains(p1)){
                p1++;
                continue;
            }
            if (res.charAt(res.length()-1) != s.charAt(p1)) {
                res.append(s.charAt(p1));
                p1++;
            } else {
                boolean found = false;
                for (int p2 = p1+1; p2<s.length(); p2 ++) {
                    if (res.charAt(res.length() - 1) != s.charAt(p2)) {
                        res.append(s.charAt(p2));
                        movedSymbols.add(p2);
                        found = true;

                        break;
                    }
                }
                p1++;
            }
        }
        return res.length() == s.length() ? res.toString() : "";
    }
}
