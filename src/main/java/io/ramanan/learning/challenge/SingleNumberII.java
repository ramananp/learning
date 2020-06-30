package io.ramanan.learning.challenge;

public class SingleNumberII {

    private static int singleNumber(int[] nums) {
        int low = 0, high = 0;
        for(int num : nums) {
            low = ~high & (low ^ num);
            high = ~low & (high ^ num);
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,4,4,3}));
    }
    
}