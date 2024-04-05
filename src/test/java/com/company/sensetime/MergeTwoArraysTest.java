package com.company.sensetime;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoArraysTest {

    MergeTwoArrays mta = new MergeTwoArrays();

    @Test
    public void mergeArrTest() {
        int[] arr1 = new int[] {1,3,4,7,8};
        int[] arr2 = new int[] {1,2,5,6,7,8};
        int[] res = new int[] {1,1,2,3,4,5,6,7,7,8,8};
        assertArrayEquals(res, mta.mergeArrays(arr1, arr2));
    }
}