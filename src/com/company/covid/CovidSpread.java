package com.company.covid;

/*
 Calculate the number of time units when COVID will spread for all patients on the hospital.
 Hospital is int[][], every value is
    0 - nobody (empty bed)
    1 - not infected patient
    2 - infected patient.

 Every time unit infected person infects neighbours
 If inject all is unreachable - return -1.
 */

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class CovidSpread {

    class Node {
        int r;
        int c;
        int dist;
        Node(int i, int j, int dist) {
            c = j;
            r = i;
            this.dist = dist;
        }
    }

    public String convertToRaw(char[][] board) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<board.length; i++)
            sb.append(String.valueOf(board[i]));
        return sb.toString();
    }

    // No "visited" array, we will modify symbols we read already.
    public boolean checkWord(int startR, int startC, char[][] currentBoard, String word) {
        boolean result = false;
        if (word.isEmpty()) return true;
        System.out.print(word.charAt(0));
        // Let's check around
        // currentBoard[startR][startC] = ' '; // space instead of current symbol

        if (startR>0 && currentBoard[startR-1][startC] == word.charAt(0)) { // up
            currentBoard[startR][startC] = ' '; // space instead of current symbol
            result = checkWord(startR-1, startC, currentBoard, word.substring(1));
        }
        if (!result && startC>0 && currentBoard[startR][startC-1] == word.charAt(0)) { // left
            currentBoard[startR][startC] = ' '; // space instead of current symbol
            result = checkWord(startR, startC-1, currentBoard, word.substring(1));
        }
        if (!result && startR<currentBoard.length-1 && currentBoard[startR+1][startC] == word.charAt(0)) { // down
            currentBoard[startR][startC] = ' '; // space instead of current symbol
            result = checkWord(startR+1, startC, currentBoard, word.substring(1));
        }
        if (!result && startC<currentBoard[startR].length-1 && currentBoard[startR][startC+1] == word.charAt(0)) { // right
            currentBoard[startR][startC] = ' '; // space instead of current symbol
            result = checkWord(startR, startC + 1, currentBoard, word.substring(1));
        }
        return result;
    }

    public boolean isWordHere(char[][] board, String word) {
        boolean result = false;
        char[][] bCopy;
        // Find the first char
        for (int r = 0; r < board.length; r++)
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == word.charAt(0)) {
                    System.out.println();
                    System.out.print(word.charAt(0));
                    bCopy = board;
                    result = checkWord(r, c, bCopy, word.substring(1));
                    if (result) return true; // break;
                }
            }
        // check all neighbours for the next symbol - recursion

        return result;
    }

    int[][] arrayCopy(int[][]source) {
        int[][] res = new int[source.length][source[0].length];
        for (int i = 0; i< res.length; i++) {
            res[i] = Arrays.copyOf(source[i], source[i].length);
        }
        return res;
    }

    // Covid spread calculation
    public int hospitalInjected(final int[][] hospital) { //}, int counter) {
        int[][] currentMap = arrayCopy(hospital); //.clone(); // it's not a copy.

        boolean modified = false;
        // System.out.println("counter = " +  counter);
        // Found 2 and change 1 to 2 in neighbour blocks.
        for (int i = 0; i < hospital.length; i++) {
            for (int j = 0; j < hospital[i].length; j++) {
                if (hospital[i][j] == 2) {
                    // infect all around
                    if (i > 0 && hospital[i - 1][j] == 1) { // up
                        currentMap[i - 1][j] = 2;
                        modified = true;
                    }
                    if (j > 0 && hospital[i][j - 1] == 1) { // left
                        currentMap[i][j - 1] = 2;
                        modified = true;
                    }
                    if (i < hospital.length - 1 && hospital[i + 1][j] == 1) { // down
                        currentMap[i + 1][j] = 2;
                        modified = true;
                    }
                    if (j < hospital[i].length - 1 && hospital[i][j + 1] == 1) { // right
                        currentMap[i][j + 1] = 2;
                        modified = true;
                    }
                }
            }
        }
        if (modified)
            return hospitalInjected(currentMap) + 1;
        else
            return 0;
    }




    List<Node> exploreNextStep(int[][] hospital) {
        return null;
    }

    // We can move to cell i,j
    boolean isValid(int[][] hospital, boolean[][] visited, int row, int col) {

        boolean res =  (row >= 0) && (row < hospital.length) && (col >= 0) && (col < hospital[row].length)
                && hospital[row][col] !=0 && !visited[row][col];
        System.out.println(row + "." + col + ":" + res);
        return res;
    }

    // Below arrays detail all four possible movements from a cell
    private static final int[] row = { -1, 0, 1, 0 };
    private static final int[] col = { 0, 1, 0, -1 };

    // Map and start position
    int BFS(int[][] hospital, int i, int j) {

        // construct a matrix to keep track of visited cells
        int N = hospital.length;
        int M = hospital[0].length;
        boolean[][] visited = new boolean[N][M];

        // create an empty queue
        Queue<Node> q = new ArrayDeque<>();

        // mark the source cell as visited and enqueue the source node
        q.add(new Node(i, j, 0));

        // stores length of the longest path from source to destination
        int min_dist = Integer.MAX_VALUE;
        // loop till queue is empty
        while (!q.isEmpty()) {
            // dequeue front node and process it
            System.out.println("Q size: " + q.size());
            Node node = q.poll();
            System.out.println(node.r + "." + node.c + " d: " + node.dist);
            visited[node.r][node.c] = true;

            // `(i, j)` represents a current cell, and `dist` stores its
            // minimum distance from the source
            // Found infected - done.
            if (hospital[node.r][node.c] == 2) {
                min_dist = node.dist;
                break;
            } else {
                // check for all four possible movements from the current cell
                // and enqueue each valid movement
                for (int k = 0; k < 4; k++) {
                    // check if it is possible to go to next position
                    if (isValid(hospital, visited, node.r + row[k], node.c + col[k])) {
                        // mark next cell as visited and enqueue it
                        visited[node.r + row[k]][node.c + col[k]] = true;
                        q.add(new Node(node.r + row[k], node.c + col[k], node.dist + 1));
                    }
                }
            }

        } // while
        return min_dist;
    }

    public int covidSpreadDays(int[][] hospital) {

        int min_dist = Integer.MIN_VALUE;

        for (int i = 0; i<hospital.length; i++) {
            for (int j=0; j<hospital[i].length; j++ ) {
                int res = BFS(hospital, i, j);
                if (res == Integer.MAX_VALUE) {
                    return -1;
                }
                if (min_dist > res) {
                    min_dist = res;
                }
            }
        }
        return min_dist;
    }


}
