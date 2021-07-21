package com.company.codility;

import java.util.Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if (A.length % K == 0 || A.length < 2)
            return A;
        int [] rotatedA = new int[A.length];
        System.out.println(A.length + ", K=" + K);
        for (int i=0; i<A.length; i++) {
            //rotated index needs to "wrap" around end of array
            int rotatedIndex = (i + K) % A.length;
            System.out.println(i + ", " + rotatedIndex);
            rotatedA[rotatedIndex] = A[i];
        }
        return rotatedA;
    }
}

