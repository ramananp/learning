package io.ramanan.learning.sorting;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Heap {

    private static int[] array = new int[10];

    public static int getLeftChildIndex(int index, int endIndex) {
        int leftChildIndex = 2 * index + 1;
        if(leftChildIndex > endIndex) {
            return -1;
        }
        return leftChildIndex;
    }

    public static int getRightChildIndex(int index, int endIndex) {
        int leftChildIndex = 2 * index + 2;
        if(leftChildIndex > endIndex) {
            return -1;
        }
        return leftChildIndex;
    }

    public static int getParentIndex(int index, int endIndex) {
        if(index < 0 || index > endIndex) {
            return -1;
        }
        return (index-1)/2;
    }

    public static void swap(int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void perculateDown(int index, int endIndex) {
        int leftChildIndex = getLeftChildIndex(index, endIndex);
        int rightChildIndex = getRightChildIndex(index, endIndex);
        if(leftChildIndex != -1 && array[leftChildIndex] > array[index]) {
            swap(leftChildIndex, index);
            perculateDown(leftChildIndex, endIndex);
        }
        if(rightChildIndex != -1 && array[rightChildIndex] > array[index]) {
            swap(rightChildIndex, index);
            perculateDown(rightChildIndex, endIndex);
        }
    }

    public static void heapfiy(int endIndex) {
        int parentIndex = getParentIndex(endIndex, endIndex);
        while(parentIndex >= 0){
            perculateDown(parentIndex, endIndex);
            parentIndex--;
        }
    }

    public static void heapSort(int[] array) {
        Heap.array = array;
        heapfiy(array.length-1);
        int endIndex = array.length - 1;
        while(endIndex > 0) {
            swap(0, endIndex);
            endIndex--;
            perculateDown(0, endIndex);
        }
    }

    public static void main(String[] args) {
        int[] array = {56, 17, 12, 5, 14, 9, 4, 2, 1, 10, 6};
        heapSort(array);
        System.out.println(IntStream.of(array).boxed().map(String::valueOf).collect(Collectors.joining(",")));
    }

}