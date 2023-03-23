package com.company.leetcode;

/**
 * Find The Longest palindrome substring.
 * One test case is failed, but in fact, it was accepted by LeetCode. Wrote them about this bug.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;

        int n = s.length();
        String res = null;
        boolean[][] matrix = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                matrix[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || matrix[i + 1][j - 1]);

                if (matrix[i][j] && (res == null || j - i + 1 > res.length())) {
                    res = s.substring(i, j + 1);
                }
            }
        }

        return res;
    }
}
