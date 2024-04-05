package com.company.sensetime;

public class MergeTwoArrays {
    public int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int p1 = 0;
        int p2 = 0;
        int current = 0;
        while (p1< arr1.length && p2 < arr2.length) {
            if (arr1[p1] == arr2[p2]) {
                result[current] = arr1[p1];
                result[++current] = arr2[p2];
                p1++;
                p2++;
            }
            else if (arr1[p1] < arr2[p2]) {
                result[current] = arr1[p1];
                p1++;
            } else {
                result[current] = arr2[p2];
                p2++;
            }
            System.out.print(result[current] + ",");
            current++;
        }

        return result;
    }
}
