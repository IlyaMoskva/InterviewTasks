package com.company.codility;

import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B) {
        Stack<Integer> down = new Stack<>();
        int lastSize;
        int aliveCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) down.push(A[i]);
            else {
                while (!down.isEmpty()) {
                    lastSize = down.peek();
                    if (lastSize > A[i]) break;
                    else down.pop();
                }
                if (down.isEmpty()) aliveCount++;
            }
        }
        return aliveCount + down.size();
    }
}