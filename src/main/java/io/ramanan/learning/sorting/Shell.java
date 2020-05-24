package io.ramanan.learning.sorting;

public class Shell {

    private static void sort(int[] array) {
        int increment = array.length/2;
        while(increment > 0) {
            for(int i=0; i<increment; i++){
                insertionSort(array, i, increment);
            }
            increment /= 2;
        }
    }

    private static void insertionSort(int[] array, int startIndex, int increment) {
        for(int i=startIndex; i<array.length-1; i=i+increment) {
            for(int j=Math.min(i+increment, array.length-1); j-increment>=0; j=j-increment){
                if(array[j-increment] > array[j]) {
                    Helper.swap(array, j-1, j);
                } else {
                    break;
                }
            }
        }
        Helper.print(array);
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