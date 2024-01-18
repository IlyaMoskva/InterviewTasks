package com.company.leetcode.strings;

import java.util.Stack;

/**
 LC394: Given an encoded string, return its decoded string.

 The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets
 is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

 You may assume that the input string is always valid;
 there are no extra white spaces, square brackets are well-formed, etc.
 Furthermore, you may assume that the original data does not contain any digits
 and that digits are only for those repeat numbers, k.
 For example, there will not be input like 3a or 2[4].
 The test cases are generated so that the length of the output will never exceed 10^5.

 Example 1:

 Input: s = "3[a]2[bc]"
 Output: "aaabcbc"
 Example 2:

 Input: s = "3[a2[c]]"
 Output: "accaccacc"
 Example 3:

 Input: s = "2[abc]3[cd]ef"
 Output: "abcabccdcdcdef"
 */
public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strBuild = new Stack<>();

        StringBuilder str = new StringBuilder();
        int num=0;

        for  (char c:s.toCharArray()) {
            if (c>='0' && c<='9') {
                num=num*10 +c -'0';
            } else if (c=='[') {
                strBuild.push(str);
                str = new StringBuilder();
                numStack.push(num);
                num = 0;
            } else if (c==']') {
                StringBuilder temp = str;
                str = strBuild.pop();
                int count = numStack.pop();
                while (count --> 0) {
                    str.append(temp);
                }
            } else {
                str.append(c);
            }
        }
        return str.toString();
    }
}
