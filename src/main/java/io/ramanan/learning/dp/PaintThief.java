package io.ramanan.learning.dp;

public class PaintThief {

    private static int[] memory;
    private static int findValue(int[] num, int length) {
        if(length < 0) {
            return 0;
        }
        if(memory[length] != 0) {
            return memory[length];
        }
        int max = Math.max(num[length] + findValue(num, length-2), findValue(num, length-1));
        memory[length] = max;
        return max;
    }

    private static int findValueIteratively(int[] num) {
        int[] mem = new int[num.length+1];
        mem[0] = num[0];
        for(int i=1; i<num.length; i++) {
            mem[i+1] = Math.max(num[i]+mem[i-1], mem[i]);
        }
        return mem[num.length];
    }

    private static int findValueIterativelyWithoutMemory(int[] nums) {
        int prevMax = 0;
        int twoAwayMax = 0;
        for(int num : nums) {
            int temp = prevMax;
            prevMax = Math.max(num+twoAwayMax, prevMax);
            twoAwayMax = temp;
        }
        return prevMax;
    }

    public static void main(String[] args) {
        int[] paints = new int[]{3,5,6,2,1,8};
        memory = new int[paints.length];
        System.out.println(findValue(paints, paints.length-1));
        System.out.println(findValueIteratively(paints));
        System.out.println(findValueIterativelyWithoutMemory(paints));
    }

}