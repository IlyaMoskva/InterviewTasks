package com.company.leetcode.queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 649. Dota2 Senate
 In the world of Dota2, there are two parties: the Radiant and the Dire.

 The Dota2 senate consists of senators coming from two parties. Now the Senate wants to decide on a change in the Dota2 game.
 The voting for this change is a round-based procedure. In each round, each senator can exercise one of the two rights:

 Ban one senator's right: A senator can make another senator lose all his rights in this and all the following rounds.
 Announce the victory: If this senator found the senators who still have rights to vote are all from the same party,
 he can announce the victory and decide on the change in the game.
 Given a string senate representing each senator's party belonging.
 The character 'R' and 'D' represent the Radiant party and the Dire party.
 Then if there are n senators, the size of the given string will be n.

 The round-based procedure starts from the first senator to the last senator in the given order.
 This procedure will last until the end of voting. All the senators who have lost their rights will be skipped during the procedure.

 Suppose every senator is smart enough and will play the best strategy for his own party.
 Predict which party will finally announce the victory and change the Dota2 game. The output should be "Radiant" or "Dire".

 Example 1:

 Input: senate = "RD"
 Output: "Radiant"
 Explanation:
 The first senator comes from Radiant and he can just ban the next senator's right in round 1.
 And the second senator can't exercise any rights anymore since his right has been banned.
 And in round 2, the first senator can just announce the victory since he is the only guy in the senate who can vote.

 Example 2:

 Input: senate = "RDD"
 Output: "Dire"
 Explanation:
 The first senator comes from Radiant and he can just ban the next senator's right in round 1.
 And the second senator can't exercise any rights anymore since his right has been banned.
 And the third senator comes from Dire and he can ban the first senator's right in round 1.
 And in round 2, the third senator can just announce the victory since he is the only guy in the senate who can vote.

 Constraints:

 n == senate.length
 1 <= n <= 104
 senate[i] is either 'R' or 'D'.
 */
public class Dota2Senat {
    // Wrong explanation caused this solution will work.
    // But it assumes, senator can ban another senator "jumped over" other senators of his party.
    public String predictPartyVictory(String senate) {
        Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();
        int n = senate.length();
        for(int i = 0;i < n;i++){
            if(senate.charAt(i) == 'R') qr.add(i);
            else qd.add(i);
        }
        for(;!qr.isEmpty() && !qd.isEmpty();){
            int r_i = qr.poll();
            int d_i = qd.poll();
            if(r_i < d_i) qr.add(r_i + n);
            else qd.add(d_i + n);
        }
        return qr.size() > qd.size() ? "Radiant" : "Dire";
    }

    // Solution based on proper explanation
    public String predictPartyVictory2(String senate) {
        int r = 0, d = 0;
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') r++;
            else d++;
        }
        int i = 0;
        StringBuilder sb = new StringBuilder(senate);
        while (r > 0 && d > 0) {
            while (i < sb.length()-1) {
                if (sb.charAt(i) != sb.charAt(i + 1)) {
                    if (sb.charAt(i+1) == 'R') r--;
                    else d--;
                    sb.deleteCharAt(i + 1);
                }
                i++;
            }
            if (sb.charAt(sb.length()-1) != sb.charAt(0)) {
                if (sb.charAt(0) == 'R') r--;
                else d--;
                sb.deleteCharAt(0);
                i=0;
            }
        }
        return r > 0 ? "Radiant" : "Dire";
    }
}
