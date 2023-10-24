package com.company.leetcode.list;

import java.util.*;
import java.util.stream.Collectors;

/**
 * LC 2215: 2215. Find the Difference of Two Arrays
 */
public class DistinctTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set set1 = new HashSet();
        for (int i=0; i< nums1.length;  i++)
            set1.add(nums1[i]);

        // filter out num2
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int i=0;i<nums2.length; i++) {
            if (!set1.contains(nums2[i]))
                set2.add(nums2[i]);
        }
        // filter out num1
        for (int i=0; i<nums2.length; i++) {
            if (set1.contains(nums2[i]))
                set1.remove(nums2[i]);
        }
        List<List<Integer>> rl = new ArrayList();

        List<Integer> array1 = (List<Integer>)set1.stream().collect(Collectors.toList());
        List<Integer> array2 = set2.stream().collect(Collectors.toList());
        rl.add(array1);
        rl.add(array2);
        return rl;
    }
}
