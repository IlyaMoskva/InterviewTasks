package com.company.codility;

import java.util.ArrayList;

public class Blocks {
    public int solution(int[] blocks) {
        ArrayList<Integer> peaks = new ArrayList<Integer>();
        for (int i = 1; i < blocks.length - 1; i++) {
            if (blocks[i] > blocks[i - 1] && blocks[i] > blocks[i + 1]) peaks.add(i);
        }

        int maxDistance = peaks.get(0); // left peak

        for (int i = 0; i < peaks.size()-1; i++) {
            if (maxDistance < peaks.get(i+1) - peaks.get(i))
                maxDistance = peaks.get(i+1) - peaks.get(i);
        }

        if (maxDistance < blocks.length - peaks.get(peaks.size()))
            maxDistance = blocks.length - peaks.get(peaks.size()); // top right peak

        return maxDistance;
    }
}
