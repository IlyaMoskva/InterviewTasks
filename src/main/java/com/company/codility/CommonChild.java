package com.company.codility;

import java.util.Locale;

public class CommonChild {

/*
 * Complete the 'commonChild' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. STRING s1
 *  2. STRING s2
 */

    /*
        No need to create new Strings, use two pointers. Space Complexity is O(x+y)
        But There is StackOverflow expected, as Time Complexity is O(2^x+y) in the worst case.
     */
    private int cc(String s1, String s2, int p1, int p2) {
        if (s1.length()<p1+1 || s2.length() < p2+1)
            return 0;
        if (s1.charAt(p1) == s2.charAt(p2))
            return 1 + cc(s1, s2, p1+1, p2+1);
        else
            return Math.max(cc(s1, s2, p1, p2+1),
                    cc(s1, s2, p1+1, p2));
    }

    public int commonChild(String s1, String s2) {
        return cc(s1.toLowerCase(Locale.ROOT), s2.toLowerCase(Locale.ROOT), 0, 0);
    }

    /*
        Expected solution is to create matrix S1.length x S2.length and put there intersected matching symbols.
        Then calculate total number of matches.
     */

}
