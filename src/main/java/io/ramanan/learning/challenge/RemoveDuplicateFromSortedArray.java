package io.ramanan.learning.challenge;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    
    public static int removeDuplicates(int[] nums) {
        int length = 1, pointer = 0;
        while(length <= nums.length-1) {
            pointer = nextDistinct(pointer, nums);
            if(pointer == nums.length) {
                break;
            }
            nums[length] = nums[pointer];
            length++;
        }
        return length;
    }
    
    private static int nextDistinct(int pointer, int[] nums) {
        int value = nums[pointer];
        while (pointer <= nums.length-1 && nums[pointer] == value) {
            pointer++;
        }
        return pointer;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[] {1,2};
        int length = removeDuplicates(nums);
        System.out.println(length);
        System.out.println(Arrays.toString(nums));
    }
}