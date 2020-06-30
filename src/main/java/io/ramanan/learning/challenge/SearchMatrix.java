package io.ramanan.learning.challenge;

public class SearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        
        int row = matrix.length;
        int column = matrix[0].length;
        int left = 0;
        int right = row*column-1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            int value = matrix[mid/column][mid%column];
            if(value == target) {
                return true;
            } else if(target < value) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*int[][] matrix = new int[][]{
            {1,  4,  7,  11, 15},
            {2,  5,  8,  12, 19},
            {3,  6,  9,  16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };*/
        int[][] matrix = {{1,4},{2,5}};
        System.out.println(searchMatrix(matrix, 2));        
    }
}