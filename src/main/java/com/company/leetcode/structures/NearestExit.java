package com.company.leetcode.structures;

import java.util.LinkedList;
import java.util.Queue;

/**
 LC 1926. Nearest Exit from Entrance in Maze
 You are given an m x n matrix maze (0-indexed) with empty cells (represented as '.')
 and walls (represented as '+'). You are also given the entrance of the maze,
 where entrance = [entrancerow, entrancecol] denotes the row and column of the cell you are initially standing at.
 In one step, you can move one cell up, down, left, or right. You cannot step into a cell with a wall,
 and you cannot step outside the maze. Your goal is to find the nearest exit from the entrance.
 An exit is defined as an empty cell that is at the border of the maze. The entrance does not count as an exit.
 Return the number of steps in the shortest path from the entrance to the nearest exit, or -1 if no such path exists.

 Example 1:
 Input: maze = [["+","+",".","+"],[".",".",".","+"],["+","+","+","."]], entrance = [1,2]
 Output: 1
 Explanation: There are 3 exits in this maze at [1,0], [0,2], and [2,3].
 Initially, you are at the entrance cell [1,2].
 - You can reach [1,0] by moving 2 steps left.
 - You can reach [0,2] by moving 1 step up.
 It is impossible to reach [2,3] from the entrance.
 Thus, the nearest exit is [0,2], which is 1 step away.

 Example 2:
 Input: maze = [["+","+","+"],[".",".","."],["+","+","+"]], entrance = [1,0]
 Output: 2
 Explanation: There is 1 exit in this maze at [1,2].
 [1,0] does not count as an exit since it is the entrance cell.
 Initially, you are at the entrance cell [1,0].
 - You can reach [1,2] by moving 2 steps right.
 Thus, the nearest exit is [1,2], which is 2 steps away.

 Example 3:
 Input: maze = [[".","+"]], entrance = [0,0]
 Output: -1
 Explanation: There are no exits in this maze.

 Idea: To find the fastest path we use BFS
 */
public class NearestExit {
    public int nearestExit(char[][] maze, int[] entrance) {
        int[][] moves = new int[][] {{-1,0},{0,-1},{1,0},{0,1}};
        int n = maze.length;
        int m = maze[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(entrance);
        int counter = 0;
        maze[entrance[0]][entrance[1]] = 'v'; // We can't go out from entrance

        while (!q.isEmpty()) {
            int elems = q.size();
            for (int el = 0; el<elems; el++) {
                int[] position = q.poll();
                // Condition to go away
                if (position != entrance &&
                        (position[0] == 0 || position[0] == n - 1 ||
                                position[1] == 0 || position[1] == m - 1)
                ) return counter;
                // Check the possible ways
                for (int[] move : moves) {
                    int[] newPos = new int[2];
                    newPos[0] = position[0] + move[0];
                    newPos[1] = position[1] + move[1];
                    if (newPos[0] > -1 && newPos[1] > -1 && newPos[0] < n && newPos[1] < m &&
                            maze[newPos[0]][newPos[1]] == '.') {
                        q.add(newPos);
                        maze[newPos[0]][newPos[1]] = 'v'; // Mark this point as visited
                    }
                }
            }
            // increment step count
            counter++;
            System.out.println(counter);
            printMap(maze);
        }
        return -1;
    }
    private void printMap(char[][] maze) {
        for (char[] chars : maze) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }
    }
}
