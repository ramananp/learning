package io.ramanan.learning.challenge;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MovingZeros {

    /*public void moveZeroes(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(j >= i) {
            if(nums[i] == 0) {
                move(nums, i, j);
                j--;
            } else {
                i++;
            }
        }
    }

    private void move(int[] nums, int i, int j) {
        while(i<j) {
            int num = nums[i+1];
            nums[i+1] = nums[i];
            nums[i] = num;
            i++;
        }
    }*/
    
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for(int i=index;i<nums.length; i++) {
            nums[i] = 0;
        }
    }


    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        String value = IntStream.of(nums).mapToObj(num -> String.valueOf(num)).collect(Collectors.joining(","));
        System.out.println(value);
    }

}