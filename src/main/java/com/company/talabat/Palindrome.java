package com.company.talabat;

/*
Let's write a function to check if a string is a palindrome or would be a palindrome after removing any of the characters from the string.
example:
1. abcbad -> abcba (remove d) -> true
2. abcmba -> abcba (remove m) -> true
3. abccba -> abccba (no removal needed) -> true
4. abcabc -> false (the string would never be a palindrome)

 */
public class Palindrome {

    public boolean isPalindromePossible(String s) {
        if (s.length() <= 1) return true;
        int i = 0;
        int leftShift = 0;
        int rightShift = 0;
        while (i < s.length()/2) {
            if (s.charAt(i)+leftShift != s.charAt(s.length()-i-1-rightShift))
                if (leftShift + rightShift > 0)
                    return false;
                else {
                    if (s.charAt(i+1) == s.charAt(s.length()-i-1))
                        leftShift++;
                    else if (s.charAt(i) == s.charAt(s.length()-i-2))
                        rightShift++;
                    else return false;
                }
            i++;
        }
        return true;
    }
}
