package com.company.codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class w2 {
    private static int solve(int[] A){
        Map<Integer,int[]> map = new HashMap<>();
        int max_sum = -1;
        for(int i=0;i<A.length;++i){
            int temp = A[i];
            int sum = 0;
            while(temp > 0){
                sum += (temp % 10);
                temp /= 10;
            }
            if(!map.containsKey(sum)){
                map.put(sum,new int[3]);
                map.get(sum)[2] = A[i];
            }else{
                int[] nums = map.get(sum);
                nums[0] = A[i];
                Arrays.sort(nums);
                max_sum = Math.max(max_sum,Integer.sum(map.get(sum)[1],map.get(sum)[2]));
            }
        }

        return max_sum;
    }
}
