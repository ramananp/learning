package io.ramanan.learning.sorting;

public class Bubble {

    public static void sort(int[] array) {
        for(int j=0; j<array.length-1; j++) {
            boolean swapped = false;
            for(int i = 0; i<array.length-1; i++) {
                if(array[i] > array[i+1]){
                    swapped = true;
                    Helper.swap(array, i, i+1);
                }
            }
            if(!swapped) {
                return;
            }
            Helper.print(array);
        }
    }

    public static void main(String[] args) {
        //int[] array = {4,5,6,2,1,7,10,3,8,9};
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Helper.print(array);
        sort(array);
    }
}