package com.company.codility;
/*
    Task from Microsoft interview.
    Given a String with a-z and ?. '?' symbols put randomly across the String.
    Provide a solution returns new string with any other symbols instead of '?'
    with the following condition:
    not allowed to put 2 same symbols in a row. All '?' must be substituted with any other symbol from [a-z].
    Provide a sufficient algorithm.
 */

public class Riddle {


    public char nextChar(char ch) {
        return (ch == 'z') ? 'a' : ((char)((int)'a' + ((int)ch - (int)'a') + 1 ) );
    }

    public String solution(final String riddle) {
        if (riddle.length()==0) return riddle;
        StringBuilder result = new StringBuilder();

        char ch;

        for (int i=0; i < riddle.length(); i++) {
            if (riddle.charAt(i) == '?') {
                ch = (i == 0) ? 'a' : nextChar(result.charAt(i-1));
                if (i < riddle.length() - 1 && riddle.charAt(i + 1) == ch) {
                    ch = nextChar(ch);
                }
                result.append(ch);
                System.out.print(ch);
            } else {
                System.out.print(riddle.charAt(i));
                result.append(riddle.charAt(i));
            }
        }


        return result.toString();
    }
}
