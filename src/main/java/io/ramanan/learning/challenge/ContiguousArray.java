package io.ramanan.learning.challenge;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    
    private static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                count--;
            }
            if(map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        //int[] array = {0, 1, 1, 0, 0, 1, 1, 1};
        //int[] array = {1,1,1,1,1,1};
        int[] array = {0,1,1,0,1,1,1,0};
        System.out.println(findMaxLength(array));
    }
}