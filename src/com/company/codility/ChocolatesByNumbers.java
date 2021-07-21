package com.company.codility;

public class ChocolatesByNumbers {
    int solution(int N, int M) {
        boolean[] wrapper = new boolean[N];
        int i = 0;
        int counter = 0;

        while (!wrapper[i]) {
            counter++;
            wrapper[i] = true;
            i= (i+M) % N;
        }
        return counter;
    }
}
