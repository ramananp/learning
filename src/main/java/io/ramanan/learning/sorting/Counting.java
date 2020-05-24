package io.ramanan.learning.sorting;

import java.util.Arrays;

public class Counting {

    private static int[] sortScores(int[] unorderedScores, int highestPossibleScore) {

        // sort the scores in O(n) time
        int[] countArray = new int[highestPossibleScore];
        for(int score : unorderedScores) {
            int count = countArray[score];
            countArray[score] = ++count;
        }
        
        for(int i = 0; i<countArray.length-1; i++) {
            countArray[i+1] = countArray[i] + countArray[i+1];
        }
        
        int current;
        int future = countArray[0];
        for(int i = 0; i<countArray.length-1; i++) {
            current = future;
            future = countArray[i+1];
            countArray[i+1] = current;
        }
        countArray[0] = 0;

        int[] sortedArray = new int[unorderedScores.length];
        for(int score : unorderedScores) {
            sortedArray[countArray[score]] = score;
            countArray[score] = countArray[score]+1;
        }

        return sortedArray;
    }
    public static void main(String[] args) {
        int[] sorted = sortScores(new int[]{9,9,8,4,7,8,3,2}, 10);
        System.out.println(Arrays.toString(sorted));
    }

}