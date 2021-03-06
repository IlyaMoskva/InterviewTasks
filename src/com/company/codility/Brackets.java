package com.company.codility;

import java.util.Stack;

/*
Brackets
Determine whether a given string of parentheses (multiple types) is properly nested.
Task Score
100%
Correctness
100%
Performance
100%

Task description

A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..200,000];
string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 */
public class Brackets {

    private boolean isClosing(char ch) {
        return (ch == ')' || ch == '}' || ch == ']');
    }

    private boolean isOpening(char ch) {
        return (ch == '(' || ch == '{' || ch == '[');
    }

    private boolean isMatch(char op, char cl) {
        if ((op == '(' && cl == ')') ||
            (op == '[' && cl == ']') ||
            (op == '{' && cl == '}'))
            return true;
        return false;
    }

    public int solution(String S) {
        if (S.isEmpty())
            return 1;
        Stack stack = new Stack();
        char ch;
        for (int i=0; i<S.length(); i++) {
            ch = S.charAt(i);
            if (isOpening(ch)) {
                stack.push(ch);
            }
            if (isClosing(ch)) {
                if (stack.size() == 0)
                    return 0;
                if (isMatch((char)stack.peek(), ch)) {
                    stack.pop();
                } else
                    return 0;
            }
        }
        return (stack.size() == 0) ? 1 : 0;
    }

}
