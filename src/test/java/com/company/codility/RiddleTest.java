package com.company.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RiddleTest {

    Riddle t = new Riddle();

    @Test
    void testNextChar() {
        assertEquals('z', t.nextChar('y'));
        assertEquals('b', t.nextChar('a'));
        assertEquals('a', t.nextChar('z'));
    }

    @Test
    void solution() {
        assertEquals("", t.solution(""));
        assertEquals("abcabc", t.solution("ab?ab?"));
        assertEquals("abcdef", t.solution("abc?ef"));
        assertEquals("abc", t.solution("???"));
        assertEquals("zab", t.solution("z??"));
        assertEquals("zba", t.solution("z?a"));
        assertEquals("zaba", t.solution("zaba"));
    }
}