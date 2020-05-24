package io.ramanan.learning.challenge;

import java.util.HashMap;
import java.util.Map;

public class CountingElements {

    public static int countElements(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int value : arr) {
            map.computeIfPresent(value, (key, val) -> val+1);
            map.computeIfAbsent(value, (val) -> 1);
        }
        
        int count = 0;
        for(int value : map.keySet()) {
            if(map.containsKey(value+1)) {
                count += map.get(value);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,3,5,0};
        int count = countElements(arr);
        System.out.println(count);
    }

}