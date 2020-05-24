package io.ramanan.learning.sorting;

public class Quick {

    private static void sort(int[] list, int low, int high) {
        if(low >= high) {
            return;
        }
        int pivot = partition(list, low, high);
        sort(list, low, pivot-1);
        sort(list, pivot+1, high);
    }

    //from https://www.baeldung.com/java-quicksort
    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);
     
        for (int j = begin; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                Helper.swap(arr, i, j);
            }
            Helper.print(arr);
        }
        
        Helper.swap(arr, i+1, end);
        //Helper.print(arr);
        return i+1;
    }

    public static void main(String[] args) {
        //int[] array = {6, 5, 4, 2, 1, 7, 10, 3, 8, 9};
        //int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        //int[] array = {10, 3, 5, 4, 2, 1, 6, 8, 7, 9};
        //int[] array = {5, 10, 9, 8, 3, 4, 6, 7};
        //int[] array = {5, 9, 4, 6, 8};
        int[] array = {3, 5, 8, 6, 4};
        System.out.println("------------------------------");
        Helper.print(array);
        System.out.println("------------------------------");
        sort(array, 0, array.length-1);
    }
}