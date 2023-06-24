package lec53;

import java.util.Arrays;

public class Minimum_Path_Sum {
    public static void main(String[] args) {
       int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }

    private static int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length + 1][grid[0].length + 1];
        for (int[] a : dp){
            Arrays.fill(a , - 1);
        }
        return minPath(grid,0,0,dp);
    }

    private static int minPath(int[][] grid, int i, int j,int[][] dp) {
        if (i == grid.length - 1 && j == grid[0].length - 1)return grid[i][j];
        if (i >= grid.length || j >= grid[0].length)return Integer.MAX_VALUE;
        if (dp[i][j] != -1)return dp[i][j];

        int ans1 = minPath(grid, i + 1 , j,dp);
        int ans2 = minPath(grid , i, j + 1,dp);
        return dp[i][j] =  Math.min(ans1, ans2) + grid[i][j];
    }
}
