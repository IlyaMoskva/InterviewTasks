package com.company.codility;

public class BinaryGap {

    public int solution(int number) {
        // Binary SHR
        number >>>= Integer.numberOfTrailingZeros(number);
        int steps = 0;
        while ((number & (number + 1)) != 0) {
            number |= number >>> 1; // Binary OR
            steps++;
        }

        return steps;
    }
}
