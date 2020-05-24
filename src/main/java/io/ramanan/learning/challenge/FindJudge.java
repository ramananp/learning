package io.ramanan.learning.challenge;

import java.util.HashMap;
import java.util.Map;

public class FindJudge {

    public static int findJudge(int N, int[][] trust) {
        if(trust == null || trust.length == 0) {
            return N;
        }
        Map<Integer, Integer> trustCount = new HashMap<>();
        Map<Integer, Integer> trustMap = new HashMap<>();
        int judge = 0;
        int max = 0;
        for(int i=0; i<trust.length; i++) {
            //System.out.println(Arrays.toString(trust[i]));
            trustMap.put(trust[i][0], trust[i][1]);
            trustCount.put(trust[i][1], trustCount.getOrDefault(trust[i][1], 0)+1);
            if(max < trustCount.getOrDefault(trust[i][1], 0)) {
                max = trustCount.getOrDefault(trust[i][1], 0);
                judge = trust[i][1];
            }
        }
        //System.out.println(trustCount);
        //System.out.println(trustMap);
        return trustMap.get(judge) == null? judge:-1;
    }

    public static void main(String[] args) {
        int[][] array = {{1,8},{1,3},{2,8},{2,3},{4,8},{4,3},{5,8},{5,3},{6,8},{6,3},{7,8},{7,3},{9,8},{9,3},{11,8},{11,3}};
        System.out.println(findJudge(11, array));
    }
    
}