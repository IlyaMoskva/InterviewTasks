package com.company.leetcode;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.

 * Example 1:
 * Input: s = "()"
 * Output: true

 * Example 2:
 * Input: s = "()[]{}"
 * Output: true

 * Example 3:
 * Input: s = "(]"
 * Output: false
 */
public class Parentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> lastOpen = new Stack<>();
        for (char c: s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    lastOpen.push(c);
                    break;
                case ']': if (lastOpen.empty() || lastOpen.pop() != '[') return false;
                    break;
                case '}': if (lastOpen.empty() || lastOpen.pop() != '{') return false;
                    break;
                case ')': if (lastOpen.empty() || lastOpen.pop() != '(') return false;
                    break;
            }
        }
        return lastOpen.empty();
    }
}
