package com.company.leetcode.matrix;

/**
 * LC 59. Spiral Matrix II
 * Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
 Example 1:
 Input: n = 3
 Output: [[1,2,3],[8,9,4],[7,6,5]]

 Example 2:
 Input: n = 1
 Output: [[1]]

 Constraints:
 1 <= n <= 20
 */
public class SpiralMatrix2 {

    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int count = 1;
        int total = n * n;

        // initialize variables for keeping track of starting and ending rows and columns
        int startingRow = 0;
        int endingRow = n - 1;
        int startingCol = 0;
        int endingCol = n - 1;

        while (count <= total) {

            // fill in the top row from left to right
            for (int i = startingCol; i <= endingCol; i++) {
                ans[startingRow][i] = count;
                count++;
            }
            startingRow++;

            // fill in the right column from top to bottom
            for (int i = startingRow; i <= endingRow; i++) {
                ans[i][endingCol] = count;
                count++;
            }
            endingCol--;

            // fill in the bottom row from right to left
            for (int i = endingCol; i >= startingCol; i--) {
                ans[endingRow][i] = count;
                count++;
            }
            endingRow--;

            // fill in the left column from bottom to top
            for (int i = endingRow; i >= startingRow; i--) {
                ans[i][startingCol] = count;
                count++;
            }
            startingCol++;
        }
        return ans;
    }

}
