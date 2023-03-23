package com.company.codility;

public class MaxDoubleSlice {
    public int solution(int[] A) {
        int[] slice1LocalMax = new int[A.length];
        int[] slice2LocalMax = new int[A.length];

        //start from i=1 because slice can't start at index 0
        for (int i = 1; i < A.length-1; i++) {
            slice1LocalMax[i] = Math.max(slice1LocalMax[i-1] + A[i], 0);
        }
        //start from i=A.length-2 because slice can't end at index A.length-1
        for (int i = A.length-2; i > 0; i--){
        slice2LocalMax[i] = Math.max(slice2LocalMax[i+1]+A[i], 0);
    }

    int maxDoubleSliceSum = 0;

    //compute sums of all slices to find absolute max
    for(int i = 1; i < A.length-1; i++) {
        maxDoubleSliceSum = Math.max(maxDoubleSliceSum, slice1LocalMax[i-1] + slice2LocalMax[i+1]);
    }

    return maxDoubleSliceSum;
}
}
