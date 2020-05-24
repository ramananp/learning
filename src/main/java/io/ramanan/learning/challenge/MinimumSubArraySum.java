package io.ramanan.learning.challenge;

public class MinimumSubArraySum {
    
    private static int minSubArrayLen(int s, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int i = 0; i<nums.length; i++) {
            sum += nums[i];
            while(sum >= s) {
                ans = Math.min(ans, i+1-left);
                sum -= nums[left++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0: ans;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }

}