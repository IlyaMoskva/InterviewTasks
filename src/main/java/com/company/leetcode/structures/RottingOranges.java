package com.company.leetcode.structures;

import java.util.ArrayList;
import java.util.List;

/**
 LC994. Rotting Oranges
 You are given an m x n grid where each cell can have one of three values:

 0 representing an empty cell,
 1 representing a fresh orange, or
 2 representing a rotten orange.
 Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

 Return the minimum number of minutes that must elapse until no cell has a fresh orange.
 If this is impossible, return -1.

 Example 1:
 Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
 Output: 4

 Example 2:
 Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
 Output: -1
 Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.

 Example 3:
 Input: grid = [[0,2]]
 Output: 0
 Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.


 Constraints:

 m == grid.length
 n == grid[i].length
 1 <= m, n <= 10
 grid[i][j] is 0, 1, or 2.

 Idea: BFS
 */
public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int counter = 0;
        List<RowColPair> pairs = new ArrayList<>();
        int[][] dirs = {{-1,0},{0,1},{1,0},{0,-1}};
        int freshNumber = 0;

        // fulfill it
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2)
                    pairs.add(new RowColPair(i,j));
                if (grid[i][j] == 1)
                    freshNumber++;
            }
        }
        System.out.println("Before");
        printGrid(grid);
        System.out.println("After:");
        while (!pairs.isEmpty()) {
            int size = pairs.size();
            boolean changed = false;
            for (int q = 0; q < size; q++) {
                RowColPair p = pairs.remove(0);
                for (int[] dir: dirs) {
                    int x = p.r + dir[0];
                    int y = p.c + dir[1];
                    if (x>=0 && x< grid.length && y>=0 && y<grid[0].length && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        pairs.add(new RowColPair(x, y));
                        freshNumber--;
                        changed = true;
                    }
                }
            } // for
            if (changed) counter++;
            printGrid(grid);
            System.out.println("counter: " + counter);
        } // while

        return freshNumber > 0 ? -1 : counter;
    }

    public void printGrid(int[][] grid) {
        for (int[] ints : grid) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
