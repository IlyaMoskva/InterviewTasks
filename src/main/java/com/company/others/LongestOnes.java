package com.company.others;

/*
    Given the sequence of 0 and 1. Find the longest subsequence of 1, if you can remove one 0.
    Return the number of 1 as longest possible subsequence.
    Example: 0010110110011101 must return 5

    Solution:
    Calculate seq, then check zero to "loneliness" and calculate next seq. Compare Max with two of them.
    Complexity is O(n)
 */
public class LongestOnes {
    public int solution(int[] arr) {
        if (arr.length == 0) return 0;

        int result = 0, counter = 0, prevCounter = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 1) {
                counter++;
            }
            if (arr[i] == 0) {
                result = Math.max(prevCounter + counter, result);
                if (i<arr.length-1 && arr[i+1] == 0) { // calculate max
                    prevCounter = 0;
                } else { // next is 1 or end
                    prevCounter = counter;
                }
                counter = 0;
            }
        }
        result = Math.max(prevCounter + counter, result);
        return result;
    }
}
