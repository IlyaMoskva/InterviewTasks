package com.company.leetcode;

import java.util.Set;

/**
 * LC 839: Similar String Groups
 * Two strings X and Y are similar if we can swap two letters (in different positions) of X, so that it equals Y.
 * Also two strings X and Y are similar if they are equal.
 * For example, "tars" and "rats" are similar (swapping at positions 0 and 2),
 * and "rats" and "arts" are similar, but "star" is not similar to "tars", "rats", or "arts".
 * Together, these form two connected groups by similarity: {"tars", "rats", "arts"} and {"star"}.
 * Notice that "tars" and "arts" are in the same group even though they are not similar.
 * Formally, each group is such that a word is in the group if and only if it is similar to at least one other word in the group.

 * We are given a list strs of strings where every string in strs is an anagram of every other string in strs. How many groups are there?
 * Example 1:
 * Input: strs = ["tars","rats","arts","star"]
 * Output: 2
 * Example 2:
 * Input: strs = ["omv","ovm"]
 * Output: 1

 * Constraints:

 * 1 <= strs.length <= 300
 * 1 <= strs[i].length <= 300
 * strs[i] consists of lowercase letters only.
 * All words in strs have the same length and are anagrams of each other.
 */
public class SimilarStringGroups {
    public int numSimilarGroups(String[] strs) {
        Set<Integer> visited = new java.util.HashSet<>();
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (!visited.contains(i)) {
                dfs(strs, i, visited);
                count++;
            }
        }
        return count;
    }

    public void dfs(String[] strs, int index, Set<Integer> visited) {
        visited.add(index);
        for (int i = 0; i < strs.length; i++) {
            if (!visited.contains(i) && isSimilar(strs[index], strs[i])) {
                dfs(strs, i, visited);
            }
        }
    }

    public boolean isSimilar(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
            }
            if (count >2) return false;
        }
        return true;
    }
}
