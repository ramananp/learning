package io.ramanan.learning.challenge;

//https://leetcode.com/problems/single-number/

public class SingleNumber {
    public static int singleNumber(int[] nums) {

        if(nums == null || nums.length == 0) return 0;

        int ans = 0;

        for(int num : nums) {
            ans ^= num;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,5,2,4,4,5};
        int answer = singleNumber(nums);
        System.out.println(answer);
    }
}