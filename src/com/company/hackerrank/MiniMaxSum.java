package com.company.hackerrank;

import java.util.List;

/*
https://www.hackerrank.com/challenges/three-month-preparation-kit-mini-max-sum/problem
Given five positive integers, find the minimum and maximum values that can be calculated by summing
exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Result: 100 out of 100
 */
public class MiniMaxSum {

    private long minVal;
    private long maxVal;
    private long fullSum;

    public MiniMaxSum(List<Integer> arr) {
        if (arr.size() <2) {
            minVal = 0;
            maxVal = 0;
            fullSum = 0;
            return;
        }
        minVal = arr.get(0);
        maxVal = arr.get(0);
        fullSum = arr.get(0);
        // To ger O(n) we have to calculate it in one round
        for (int i = 1; i<arr.size(); i++) {
            fullSum += arr.get(i);
            if (minVal > arr.get(i)) {
                    minVal = arr.get(i);
            }
            if (maxVal < arr.get(i)) {
                maxVal = arr.get(i);
            }
        }
    }

    public long getMinVal() {
        return fullSum - maxVal;
    }

    public long getMaxVal() {
        return fullSum - minVal;
    }
}
