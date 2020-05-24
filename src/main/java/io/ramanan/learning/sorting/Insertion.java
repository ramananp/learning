package io.ramanan.learning.sorting;

public class Insertion {

    private static void sort(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j>0; j--){
                if(array[j-1] > array[j]) {
                    Helper.swap(array, j-1, j);
                } else {
                    break;
                }
            }
            Helper.print(array);
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
        //int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("------------------------------");
        Helper.print(array);
        System.out.println("------------------------------");
        sort(array);
    }
}