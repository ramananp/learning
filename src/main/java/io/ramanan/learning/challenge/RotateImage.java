package io.ramanan.learning.challenge;

import java.util.Arrays;

public class RotateImage {

    public static void rotate(int[][] matrix) {
        int l = matrix.length; 
        for (int i = 0; i < l/2; i++) {
            for (int j = i; j < l-i-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[l-j-1][i];
                matrix[l-1-j][i] = matrix[l-1-i][l-1-j];  
                matrix[l-1-i][l-1-j] = matrix[j][l-1-i];    
                matrix[j][l-1-i] = temp;  
            }   
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                                        {1,2,3},
                                        {4,5,6},
                                        {7,8,9}
                                     };
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    
}