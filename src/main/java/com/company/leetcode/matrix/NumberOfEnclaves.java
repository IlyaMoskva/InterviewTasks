package com.company.leetcode.matrix;

import java.util.Arrays;

/**
 * 1020. Number of Enclaves
 * You are given an m x n binary matrix grid, where 0 represents a sea cell and 1 represents a land cell.
 * A move consists of walking from one land cell to another adjacent (4-directionally) land cell or walking off the boundary of the grid.
 * Return the number of land cells in grid for which we cannot walk off the boundary of the grid in any number of moves.

 * Idea is to find all the cells on border and apply dfs, where to set all available '1' to '0'. Then count rest of '1's.
 */
public class NumberOfEnclaves {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if ((i==0 || j == 0 || i==n-1 || j==m-1) && grid[i][j]==1)
                    dfs(grid, i, j);
            }
        }
        return Arrays.stream(grid).mapToInt(row->Arrays.stream(row).sum()).sum();
    }
    private void dfs(int[][] grid, int i, int j) {
        grid[i][j] = 0;
        int[][] dirs = {{-1,0},{0,1},{1,0},{0,-1}};
        for (int[] dir: dirs) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (x>=0 && x< grid.length && y>=0 && y<grid[0].length && grid[x][y] == 1)
                dfs(grid, x, y);
        }
    }
}
