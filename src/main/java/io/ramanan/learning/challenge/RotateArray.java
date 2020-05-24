package io.ramanan.learning.challenge;

import java.util.Arrays;

public class RotateArray {

    public static void rotate1(int[] nums, int k) {
        if(nums == null || nums.length <= 0 || nums.length == 1
          || k == 0){
            return;
        }
        int[] newNums = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            newNums[(i+k)%nums.length] = nums[i];
        }
        for(int i=0; i<nums.length; i++) {
            nums[i] = newNums[i];
        }
    }
    
    public static void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
          previous = nums[nums.length - 1];
          for (int j = 0; j < nums.length; j++) {
            temp = nums[j];
            nums[j] = previous;
            previous = temp;
          }
        }
      }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3};
        rotate(nums, 1);
        System.out.println(Arrays.toString(nums));
    }
    
}