package com.company.leetcode;

import java.util.Stack;

/**
 * LC 32. Longest Valid Parentheses
 Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses
 substring

 Example 1:
 Input: s = "(()"
 Output: 2
 Explanation: The longest valid parentheses substring is "()".

 Example 2:
 Input: s = ")()())"
 Output: 4
 Explanation: The longest valid parentheses substring is "()()".

 Example 3:
 Input: s = ""
 Output: 0


 Constraints:
 0 <= s.length <= 3 * 104
 s[i] is '(', or ')'.
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int  max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }
}
