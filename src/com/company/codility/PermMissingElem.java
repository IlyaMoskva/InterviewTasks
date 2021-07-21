package com.company.codility;

import java.util.Arrays;

/*
    https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 */
public class PermMissingElem {
    // Find the missing element in unsorted array

    public int solution(int[] A) {
        // Corner cases
        if (A.length == 0) return 1;

        int sum = A[0];
        for (int i = 1; i< A.length;i++) {
            sum +=A[i];
        }
        System.out.println("Sum = " + sum);
        // We expect sum = (min + max) * len/2 ? odd
        int expectedSum = (A.length+1) * (A.length+2) / 2;

        System.out.println("expectedSum = " + expectedSum);
        return expectedSum - sum;
    }
}
