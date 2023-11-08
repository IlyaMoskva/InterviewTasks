package com.company.leetcode.matrix;

import java.util.Arrays;

/**
 1921. Eliminate Maximum Number of Monsters

 You are playing a video game where you are defending your city from a group of n monsters.
 You are given a 0-indexed integer array dist of size n,
 where dist[i] is the initial distance in kilometers of the ith monster from the city.

 The monsters walk toward the city at a constant speed.
 The speed of each monster is given to you in an integer array speed of size n,
 where speed[i] is the speed of the ith monster in kilometers per minute.

 You have a weapon that, once fully charged, can eliminate a single monster.
 However, the weapon takes one minute to charge. The weapon is fully charged at the very start.

 You lose when any monster reaches your city.
 If a monster reaches the city at the exact moment the weapon is fully charged,
 it counts as a loss, and the game ends before you can use your weapon.

 Return the maximum number of monsters that you can eliminate before you lose,
 or n if you can eliminate all the monsters before they reach the city.

 IDEA: change values in array to how many steps this monster need to get to city.
 Kill from minimum value and count shoots. (sort array)
 When counter > number of steps - you're loose.
 No more monsters - return counter ( == dist.length)
 */

public class EliminateMaximumNumberOfMonsters {

    public int eliminateMaximum(int[] dist, int[] speed) {
        for (int i=0; i< dist.length; i++) {
            dist[i] = numSteps(dist[i], speed[i]);
        }
        dist = Arrays.stream(dist).sorted().toArray();
        for (int i : dist) System.out.print(i + ",");
        System.out.println();

        int count = 0;
        while (count<dist.length && count < dist[count])
            count++;
        return count;
    }

    public int numSteps(int dist, int speed) {
        if (speed == 1) return dist;
        return (int)Math.ceil((double)dist/speed);
    }
}
