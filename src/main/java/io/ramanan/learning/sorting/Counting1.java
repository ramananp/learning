package io.ramanan.learning.sorting;

import java.util.Arrays;

public class Counting1 {

    private static int[] sortScores(int[] unorderedScores, int highestPossibleScore) {

        int[] countArray = new int[highestPossibleScore];
        for(int score : unorderedScores) {
            countArray[score]++;
        }

        int[] sortedArray = new int[unorderedScores.length];
        int index = 0;
        for(int i = 0; i<highestPossibleScore; i++) {
            int count = countArray[i];
            for(int j = 0; j<count; j++) {
                sortedArray[index] = i;
                index++;
            }
        }

        return sortedArray;

    }

    public static void main(String[] args) {
        //int[] sorted = sortScores(new int[]{9,9,8,4,7,8,3,2}, 10);
        int[] sorted = sortScores(new int[]{2,4,4,3}, 5);
        System.out.println(Arrays.toString(sorted));
    }

}