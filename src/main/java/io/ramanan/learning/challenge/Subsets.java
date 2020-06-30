package io.ramanan.learning.challenge;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return result;
        }
        List<Integer> list = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int num : nums) {
            list.add(num);
            List<List<Integer>> temps = new ArrayList<>();
            for(List<Integer> temp : result) {
                temps.add(new ArrayList<>(temp) {{add(num);}});
            }
            result.addAll(temps);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subset(nums));
    }
}