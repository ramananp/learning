package io.ramanan.learning.challenge;

public class MaximalSquare {

    private static int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return 0;
        }
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        int result = 0;
        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp[i].length; j++) {
                if (matrix[i-1][j-1] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j]));
                }
                result = Math.max(result, dp[i][j]);
            } 
        }
        return result*result;
    }

    @SuppressWarnings("unused")
    private static int maximalSquare1(char[][] matrix) {
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
        int[][] dp = new int[rows + 1][cols + 1];
        int maxsqlen = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[i][j]);
                }
            }
        }
        return maxsqlen * maxsqlen;
    }

    public static void main(String[] args) {
        char[][] matrix = new char[1][1];
        matrix[0][0] = '1';
        System.out.println(maximalSquare(matrix));
    }

}