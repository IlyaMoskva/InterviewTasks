package com.company.talabat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindromePossible() {
        Palindrome p = new Palindrome();
        assertTrue(p.isPalindromePossible("abcbad"));
        assertTrue(p.isPalindromePossible("acdeeda"));
        assertTrue(p.isPalindromePossible("abcmba"));
        assertTrue(p.isPalindromePossible("abccba"));
        assertFalse(p.isPalindromePossible("abcabc"));
    }
}