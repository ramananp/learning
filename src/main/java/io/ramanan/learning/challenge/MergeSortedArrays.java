package io.ramanan.learning.challenge;

import java.util.Arrays;

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] myArray, int[] alicesArray) {

        // combine the sorted arrays into one large sorted array
        int length = myArray.length+alicesArray.length;
        int[] mergedArray = new int[length];
        int myArrayIndex = 0;
        int alicesArrayIndex = 0;
        int index = 0;
        while(myArrayIndex < myArray.length && alicesArrayIndex < alicesArray.length) {
            int my = myArray[myArrayIndex];
            int alice = alicesArray[alicesArrayIndex];
            if(my < alice) {
                mergedArray[index] = my;
                myArrayIndex++;
            } else {
                mergedArray[index] = alice;
                alicesArrayIndex++;
            }
            index++;
        }
        
        while(myArrayIndex < myArray.length) {
            mergedArray[index++] = myArray[myArrayIndex];
            myArrayIndex++;
        }
        while(alicesArrayIndex < alicesArray.length) {
            mergedArray[index++] = alicesArray[alicesArrayIndex];
            alicesArrayIndex++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        final int[] myArray = {2, 4, 6, 8};
        final int[] alicesArray = {1, 7};
        final int[] actual = mergeArrays(myArray, alicesArray);
        System.out.println(Arrays.toString(actual));
    }

}