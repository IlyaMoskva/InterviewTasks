package com.company.leetcode.strings;
/**
 * LC 1903.
 * There was a task in LC about the longest Odd number in long integer string.
 * I missed the condition it contains only numbers.
 * My version supports not only numbers up to Long size.
 */

/**
 class Solution {
 public String largestOddNumber(String num) {
     if((int)num.charAt(num.length()-1)%2==1) return num;
     int i=num.length()-1;
     while(i>=0){
         int n=num.charAt(i);
         if(n%2==1) return num.substring(0,i+1);
         i--;
     }
     return "";
     }
 }
 */
public class BiggestOddInString {
    public String largestOddNumber(String num) {
        long currentMax = 0;
        StringBuilder currentNum = new StringBuilder();
        long buf = 0;
        int lastOddPosition = 0;
        int lastPosition = 0;
        for (char ch : num.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                currentNum.append(ch);
                lastPosition++;
                if (Integer.parseInt(String.valueOf(ch)) % 2 != 0) {
                    lastOddPosition = lastPosition;
                    buf = Long.parseLong(currentNum.substring(0, lastOddPosition));
                    currentMax = Math.max(currentMax, buf);
                }
            } else {
                currentNum = new StringBuilder();
                lastPosition = 0;
            }
        }
        return currentMax == 0 ? "" : String.valueOf(currentMax);
    }
}
