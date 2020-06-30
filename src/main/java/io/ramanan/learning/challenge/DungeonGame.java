package io.ramanan.learning.challenge;

public class DungeonGame {

    public static int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length, n = dungeon[0].length;
        int[][] dp = new int[m][n];
 
        dp[m - 1][n - 1] = (dungeon[m - 1][n - 1] > 0 ? 1 : Math.abs(dungeon[m - 1][n - 1]) + 1);

        for (int j = n - 2; j >= 0; j--) {
            dp[m - 1][j] = Math.max(dp[m - 1][j + 1] - dungeon[m - 1][j], 1);
        }
        
        for (int i = m - 2; i >= 0; i--){
            dp[i][n - 1] = Math.max(dp[i + 1][n - 1] - dungeon[i][n - 1], 1);
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                dp[i][j] = Math.max(1, Math.min(dp[i + 1][j] - dungeon[i][j]
                                                , dp[i][j + 1] - dungeon[i][j]));
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] matrix = new int [][] {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println(calculateMinimumHP(matrix));
    }
    
}