package io.ramanan.learning.sorting;

public class Merge {

    private static void sort(int[] array) {
        if(array.length == 1){
            return;
        }
        int midIndex = array.length/2+array.length%2;
        int[] first = new int[midIndex];
        int[] second = new int[array.length - midIndex];
        split(array, first, second);
        sort(first);
        sort(second);
        merge(array, first, second);
        Helper.print(array);
    }

    private static void split(int[] list, int[] first, int[] second) {
        int index = 0;
        int secondIndex = first.length;
        for(int element : list) {
            if(index < secondIndex) {
                first[index] = element;
            } else {
                second[index - secondIndex] = element;
            }
            index++;
        }
    }

    private static void merge(int[] list, int[] first, int[] second) {
        int index = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        while(firstIndex < first.length && secondIndex < second.length) {
            if(first[firstIndex] < second[secondIndex]) {
                list[index] = first[firstIndex];
                firstIndex++;
            } else {
                list[index] = second[secondIndex];
                secondIndex++;
            }
            index++;
        }
        while(firstIndex < first.length) {
            list[index] = first[firstIndex];
            firstIndex++;
            index++;
        }
        while(secondIndex < second.length) {
            list[index] = second[secondIndex];
            secondIndex++;
            index++;
        }
    }

    public static void main(String[] args) {
        //int[] array = {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        System.out.println("------------------------------");
        Helper.print(array);
        System.out.println("------------------------------");
        sort(array);
    }
}