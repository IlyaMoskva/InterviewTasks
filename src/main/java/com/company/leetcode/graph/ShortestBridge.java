package com.company.leetcode.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * LC934. Shortest Bridge
 You are given an n x n binary matrix grid where 1 represents land and 0 represents water.
 An island is a 4-directionally connected group of 1's not connected to any other 1's. There are exactly two islands in grid.
 You may change 0's to 1's to connect the two islands to form one island.
 Return the smallest number of 0's you must flip to connect the two islands.

 Example 1:
 Input: grid = [[0,1],[1,0]]
 Output: 1

 Example 2:
 Input: grid = [[0,1,0],[0,0,0],[0,0,1]]
 Output: 2

 Example 3:
 Input: grid = [[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
 Output: 1

 Constraints:

 n == grid.length == grid[i].length
 2 <= n <= 100
 grid[i][j] is either 0 or 1.
 There are exactly two islands in grid.

 Let's use BFS
 */
public class ShortestBridge {
    int[][] dir = new int[][] {{0, 1}, {1, 0},{0, -1}, {-1, 0}};
    List<int[]> bfsQ = new ArrayList<>();

    public int shortestBridge(int[][] grid) {
        debugPrint(grid);
        // Use -1 for Visited
        // Find the First island
        int x = -1, y = -1;
        int i =0, j = 0;
        while (i < grid.length && x == -1) {
            while( j < grid[0].length) {
                if (grid[i][j] == 1) {
                    x = i;
                    y = j;
                }
                j++;
            }
            i++;
        } // here grid[x][y] is island
        // Mark island as visited
        dfs(grid, x, y);
        // Let's find border and use BFS to get another island
        debugPrint(grid);

        return 0;
    }
    void dfs(int[][] grid, int x, int y) {
        if (grid[x][y] != 1) return;
        grid[x][y] = 2;
        for(int[] d : dir) {
            if (x+d[0] >= 0 &&  y+d[1] >= 0 && x+d[0] < grid.length && y+d[1] < grid[0].length) {
                dfs(grid, x + d[0], y + d[1]);
                bfsQ.add(new int[] {});
            }
        }
    }

    int bfs(int[][] grid, int x, int y) {
        return 0;
    }

    void debugPrint(int[][] grid) {
        for (int i =0 ; i< grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
