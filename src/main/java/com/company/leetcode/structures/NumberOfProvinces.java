package com.company.leetcode.structures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 LC 547: Number of Provinces
 There are n cities. Some of them are connected, while some are not.
 If city a is connected directly with city b, and city b is connected directly with city c,
 then city a is connected indirectly with city c.

 A province is a group of directly or indirectly connected cities and no other cities outside the group.

 You are given an n x n matrix isConnected where isConnected[i][j] = 1
 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

 Return the total number of provinces.

 Example 1:
 Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
 Output: 2

 Example 2:
 Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
 Output: 3

 Constraints:

 1 <= n <= 200
 n == isConnected.length
 n == isConnected[i].length
 isConnected[i][j] is 1 or 0.
 isConnected[i][i] == 1
 isConnected[i][j] == isConnected[j][i]

 Idea: It can be solved with graphs with DFS, BFS and Union Find methods. Here is Union Find.
 */
public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        if (isConnected == null || isConnected.length == 0) return 0;
        int n = isConnected.length;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    uf.union(i, j);
                }
            }
        }
        return uf.getCount();
    }

    class UnionFind {
        private int[] root;
        private int[] rank;
        private int count;

        UnionFind(int size) {
            root = new int[size];
            rank = new int[size];
            count = size;
            for (int i = 0; i < size; i++) {
                root[i] = i;
                rank[i] = 1;
            }
        }

        int find(int x) {
            if (x == root[x]) {
                return x;
            }
            return root[x] = find(root[x]);
        }

        void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                if (rank[rootX] > rank[rootY]) {
                    root[rootY] = rootX;
                } else if (rank[rootX] < rank[rootY]) {
                    root[rootX] = rootY;
                } else {
                    root[rootY] = rootX;
                    rank[rootX] += 1;
                }
                count--;
            }
        }

        int getCount() {
            return count;
        }
    }
}
