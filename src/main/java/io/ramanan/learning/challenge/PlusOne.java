package io.ramanan.learning.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int reminder = 0;
        for(int i = digits.length - 1; i>=0; i--) {
            int digit = digits[i];
            if(i == digits.length - 1) {
                digit++;
            }
            if(digit > 9) {
                list.add(digit%10);
                reminder = 1;
            } else {
                list.add((digit+reminder)%10);
                reminder = (digit+reminder)/10;
            }
        }
        if(reminder > 0) {
            list.add(reminder);
        }
        int[] nums = new int[list.size()];
        for(int i = 0; i<nums.length; i++) {
            nums[nums.length-i-1] = list.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {9, 9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
    
}