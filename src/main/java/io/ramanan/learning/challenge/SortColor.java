package io.ramanan.learning.challenge;

import java.util.Arrays;

public class SortColor {
    
    public static void sortColor(int[] colors) {
        if(colors == null || colors.length == 0) {
            return;
        }
        int start = 0;
        int end = colors.length - 1;
        int index = 0;
        while(index <= end && start < end) {
            if(colors[index] == 0) {
                 colors[index] = colors[start];
                 colors[start] = 0;
                 start++;
                 index++;
            } else if(colors[index] == 2) {
                colors[index] = colors[end];
                colors[end] = 2;
                end--;
            } else {
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] colors = new int[] {2, 1, 1, 2, 1, 0};
        sortColor(colors);
        System.out.println(Arrays.toString(colors));
    }
}