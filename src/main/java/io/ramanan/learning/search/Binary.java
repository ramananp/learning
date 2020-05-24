package io.ramanan.learning.search;

public class Binary {

    private static int search(int[] array, int element) {

        int min = 0;
        int max = array.length -1;

        while(min <= max) {
            int index = min + (max-min)/2;
            if(array[index] == element) {
                return index;
            } else if (array[index] > element) {
                max = index -1;
            } else {
                min = index +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2};
        //int[] array = {2, 4, 6, 8, 12, 14, 46, 78, 83, 94};
        int index = search(array, 2);
        System.out.println(index);
    }
}