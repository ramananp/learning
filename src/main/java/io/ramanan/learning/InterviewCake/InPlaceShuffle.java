package io.ramanan.learning.InterviewCake;

import java.util.Arrays;
import java.util.Random;

public class InPlaceShuffle {

    private static void shuffle(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            int random = random(i, array.length-1);
            if(random != i) {
                int value = array[random];
                array[random] = array[i];
                array[i] = value;
            }
        }
    }

    private static int random(int floor, int ceiling) {
        Random random = new Random();
        return random.nextInt((ceiling-floor)+1)+floor;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shuffle(array);
        System.out.println(Arrays.toString(array));
    }
}