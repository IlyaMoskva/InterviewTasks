package com.company.leetcode.search;

/**
 * 1095. Find in Mountain Array
 (This problem is an interactive problem.)

 You may recall that an array arr is a mountain array if and only if:

 arr.length >= 3
 There exists some i with 0 < i < arr.length - 1 such that:
 arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

 Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target.
 If such an index does not exist, return -1.

 You cannot access the mountain array directly. You may only access the array using a
 MountainArray interface:
 MountainArray.get(k) returns the element of the array at index k (0-indexed).
 MountainArray.length() returns the length of the array.

 Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer.
 Also, any solutions that attempt to circumvent the judge will result in disqualification.

 Idea: Use binary search for 1st half and last half. Or TOP and Left then right (in target is not in left side)
 */
class MountainArray {
    private final int[] _arr;
    private int _count = 0;
    public MountainArray(int[] arr) {
        _arr = arr;
    }
    public int get(int index) {
        _count++;
        return _arr[index];
    }
    public int length() {
        return _arr.length;
    }

    public int getCount() {
        return _count;
    }
}

@SuppressWarnings("ClassEscapesDefinedScope")
public class SearchInMountainArray {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // First, let's find the Mountain Peak
        int peak = findPeak(mountainArr);
        if (target == mountainArr.get(peak)) return peak;
        int res = binarySearchIncrease(0, peak, mountainArr, target);
        return (res == -1) ?
             binarySearchDecrease(peak, mountainArr.length()-1, mountainArr, target)
                : res;
    }

    public int binarySearchIncrease(int l, int r, MountainArray arr, int target) {
        int mid = 0;
        while (l<r) {
            mid = (l+r) / 2;
            int current = arr.get(mid);
            if (target == current)
                return mid;
            if (current > target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearchDecrease(int l, int r, MountainArray arr, int target) {
        int mid = 0;
        while (l<r) {
            mid = (l+r) / 2;
            System.out.print(" mid: " + mid);
            int current = arr.get(mid);
            if (current <= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return (target == arr.get(l)) ? l : -1;
    }

    public int findPeak(MountainArray mountainArr) {
        int mid = 0;
        int l = 0;
        int r = mountainArr.length()-1;
        while (l<r) {
            mid = (r+l)/2;
            if (mountainArr.get(mid) < mountainArr.get(mid+1))
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }
}
