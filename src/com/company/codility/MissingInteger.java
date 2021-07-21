package com.company.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

/*
https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 */
public class MissingInteger {
    public int solution(int[] A) {
        int smallestMissingInteger = 1;
        if (A.length == 0) {
            return smallestMissingInteger;
        }
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                s.add(A[i]);
            }
        }
        while (s.contains(smallestMissingInteger)) {
            smallestMissingInteger++;
        }
        return smallestMissingInteger;
    }
}
