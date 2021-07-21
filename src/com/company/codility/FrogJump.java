package com.company.codility;

public class FrogJump {
    /*
        From X to Y with step D
        Return number of jumps.
     */
    public int solution(int X, int Y, int D) {
        if (Y <= X || D <= 0) return 0;
        int fullJumps = (Y - X) / D;
        return (fullJumps * D < (Y - X)) ? ++fullJumps : fullJumps;
    }
}
