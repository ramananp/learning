package io.ramanan.learning.challenge;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return result;
        }
        boolean[] used = new boolean[nums.length];
        helper(nums, result, used, new ArrayList<>());
        return result;
    }
    
    private static void helper(int[] nums, List<List<Integer>> result, boolean[] used, List<Integer> permutation) {
        if(permutation.size() == nums.length) {
            result.add(new ArrayList<>(permutation));
            return;
        }
        for(int i=0; i<nums.length; i++) {
            if(used[i]) {
                continue;
            }
            used[i] = true;
            permutation.add(nums[i]);
            helper(nums, result, used, permutation);
            permutation.remove(permutation.size()-1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(permute(nums));
    }
    
}