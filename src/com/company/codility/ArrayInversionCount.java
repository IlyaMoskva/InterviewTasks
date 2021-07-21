package com.company.codility;

public class ArrayInversionCount {
    public int solution(int[] A) {
        int count = 0;
        for (int p=0; p< A.length-1; p++) {
            for (int q=p+1;q<A.length; q++)
                if (A[q] < A[p]) count++;
        }

        return count > 1000000000 ? -1 : count;
    }
}
