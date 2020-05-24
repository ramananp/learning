package io.ramanan.learning.challenge;

public class MinimumPathSum {

    private static int minimumPathSum(int[][] grid) {
        int[][] sumGrid = new int[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                sumGrid[i][j] += grid[i][j];
                if(i > 0 && j > 0) {
                    sumGrid[i][j] += Math.min(sumGrid[i][j-1], sumGrid[i-1][j]);
                } else if(i > 0) {
                    sumGrid[i][j] += sumGrid[i-1][j];
                } else if(j > 0) {
                    sumGrid[i][j] += sumGrid[i][j-1];
                }
            }
        }
        return sumGrid[sumGrid.length-1][sumGrid[0].length-1];
    }

    public static void main(String[] args) {
        //int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] grid = {
            {1,2,3},
            {1,2,3},
            {1,2,3}
        };
        /*
        {
            {1,3,6},
            {2,4,7},
            {3,5,8}
        }
        */
        System.out.println(minimumPathSum(grid));
    }

}