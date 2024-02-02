package com.company.leetcode.numbers;

import java.util.ArrayList;
import java.util.List;

/**
 1291. Sequential Digits
 An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
 Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.

 Example 1:

 Input: low = 100, high = 300
 Output: [123,234]
 Example 2:

 Input: low = 1000, high = 13000
 Output: [1234,2345,3456,4567,5678,6789,12345]

 Constraints:

 10 <= low <= high <= 10^9
 */
public class AllConsequentNumbers {
    public List<Integer> sequentialDigits(int low, int high) {
        String template = "123456789";
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < template.length(); i++) {
            for (int j = i + 1; j <= template.length(); j++) {
                int curr = Integer.parseInt(template.substring(i, j));
                if (curr <= high && curr >= low) {
                    res.add(curr);
                }
            }
        }
        res.sort(null);
        return res;
    }
}
