package com.company.covid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CovidSpreadTest {

    char[][] board = new char[3][4];
    int[][] hospital = new int[4][4];


    private void init() {
        board[0] = new char[]{'A', 'B', 'C', 'D'};
        board[1] = new char[]{'E', 'E', 'D', 'F'};
        board[2] = new char[]{'A', 'C', 'D', 'B'};

        // 4 steps and the same 1 on [3][3] - return -1
        hospital[0] = new int[]{0, 2, 1, 1};
        hospital[1] = new int[]{1, 1, 0, 1};
        hospital[2] = new int[]{0, 1, 1, 0};
        hospital[3] = new int[]{1, 1, 0, 1};
    }

    @Test
    void convertToRawTest() {

        CovidSpread cs = new CovidSpread();

        char[][] b = new char[3][2];
        b[0] = new char[]{'A', 'B'};
        b[1] = new char[]{'E', 'F'};
        b[2] = new char[]{'Q', 'W'};
        assertEquals("ABEFQW", cs.convertToRaw(b));
    }

    @Test
    void checkWordTest() {
        init();
        CovidSpread cs = new CovidSpread();
        assertTrue(cs.checkWord(1, 1, board, "CA"));
    }

    @Test
    void isWordHere() {
        init();
        CovidSpread cs = new CovidSpread();
        assertTrue(cs.isWordHere(board,"EEDD"));
        init();
        assertTrue(cs.isWordHere(board,"EABECA"));
        init();
        assertTrue(cs.isWordHere(board,"BFDEB"));
        init();
        assertTrue(cs.isWordHere(board,"DCDDCAEAB"));
        init();
        assertFalse(cs.isWordHere(board,"DCDDCAEAC"));
    }

    @Disabled
    void findPath() {
        init();
        CovidSpread cs = new CovidSpread();
        assertEquals(-1, cs.hospitalInjected(hospital));
        hospital[3][3] = 2;
        int res = cs.hospitalInjected(hospital);
        res = res == 0?-1:res;
        assertEquals(4, cs.hospitalInjected(hospital));
    }

    @Test
    void BFSTest() {
        init();
        CovidSpread cs = new CovidSpread();

        assertEquals(3, cs.BFS(hospital,3,1));
        assertEquals(3, cs.BFS(hospital,1,3));

        assertEquals(Integer.MAX_VALUE, cs.BFS(hospital,3,3));

        assertEquals(3, cs.BFS(hospital,3,1));

    }

    @Test
    void covidSpreadDays() {
        init();
        CovidSpread cs = new CovidSpread();
        assertEquals(-1, cs.covidSpreadDays(hospital));
    }
}