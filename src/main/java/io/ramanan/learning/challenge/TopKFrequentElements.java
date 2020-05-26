package io.ramanan.learning.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    private static final String Map = null;

	public static int[] topKFrequentElements(final int[] nums, final int k) {
        if(nums == null || nums.length == 0) {
            return null;
        }
        if(k == 0) {
            return new int[0];
        }

        final Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(final int num : nums) {
            final int count = map.getOrDefault(num, 0) +1;
            map.put(num, count);
            max = Math.max(count, max);
        }

        final List<Integer>[] resultList = (ArrayList<Integer>[])new ArrayList[max+1];
        for(int i=1; i<=max; i++) {
            resultList[i] = new ArrayList<Integer>();
        }

        for(final int key : map.keySet()) {
            resultList[map.get(key)].add(key);
        }

        List<Integer> result = new ArrayList<>();
        for(int i=max; i>=1; i--) {
            if(resultList[i].size() > 0) {
                for(int num : resultList[i]) {
                    result.add(num);
                    if(result.size() == k) {
                        break;
                    }
                }
            }
            if(result.size() == k) {
                break;
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequentElements(new int[]{1,1,2,2,2,3}, 1)));
    }
}