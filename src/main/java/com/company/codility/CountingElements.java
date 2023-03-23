package com.company.codility;

import java.util.HashSet;

public class CountingElements {
    public int solution(int X, int[]A) {
        HashSet<Integer> set = new HashSet<Integer>();
        int response = -1;
        for (int i = 0; i < A.length; i++){
            set.add(A[i]);
            if (set.size() == X){
                response = i;
                break;
            }
        }
        return response;
    }
}
