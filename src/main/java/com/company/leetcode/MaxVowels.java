package com.company.leetcode;

import static java.lang.System.in;

/**
 * 1456. Maximum Number of Vowels in a Substring of Given Length
 Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 Example 1:
 Input: s = "abciiidef", k = 3
 Output: 3
 Explanation: The substring "iii" contains 3 vowel letters.
 Example 2:
 Input: s = "aeiou", k = 2
 Output: 2
 Explanation: Any substring of length 2 contains 2 vowels.
 Example 3:
 Input: s = "leetcode", k = 3
 Output: 2
 Explanation: "lee", "eet" and "ode" contain 2 vowels.

 Constraints:

 1 <= s.length <= 105
 s consists of lowercase English letters.
 1 <= k <= s.length

 IDEA: Sliding window
 */
public class MaxVowels {
    public int maxVowels(String s, int k) {
        if (k < 1 || s.isEmpty()) return 0;
        if (k > s.length()) k = s.length();
        int current_max = 0;
        // get vowels_num in first substr
        for (int i=0; i<k; i++) {
            if (isVowel(s.charAt(i))) current_max++;
        }
        if (current_max == k) return k;
        int abs_max = current_max;
        for (int i=1;i<s.length()-k+1;i++){
            if (isVowel(s.charAt(i-1))) current_max--;
            if (isVowel(s.charAt(i+k-1))) current_max++;
            if (current_max > abs_max) abs_max = current_max;
        }

        return abs_max;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
