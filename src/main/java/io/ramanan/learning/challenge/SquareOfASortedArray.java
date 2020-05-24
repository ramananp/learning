package io.ramanan.learning.challenge;

import java.util.Arrays;

public class SquareOfASortedArray {

    private static int[] sortedSquares(int[] A) {
        int[] output = new int[A.length];
        int right = A.length - 1;
        int left = 0;
        int i = right;
        while (left < right) {
            if (Math.abs(A[left]) < Math.abs(A[right])) {
                output[i] = A[right] * A[right];
                right--;
            } else {
                output[i] = A[left] * A[left];
                left++;
            }
            i--;
        }
        output[0] = A[left] * A[left];
        return output;
    }

    public static void main(String[] args) {
        int[] squared = sortedSquares(new int[]{-4, -3, 0, 2, 5, 7});
        System.out.println(Arrays.toString(squared));
    }

}