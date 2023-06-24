package lec53;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {
    public static void main(String[] args) {
       int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(minFallingSum(grid));
    }

    private static int minFallingSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < grid[0].length; j++) {
            ans = Math.min(ans, minPath(grid,0,j,dp));
        }
        return ans;
    }

    private static int minPath(int[][] grid, int i, int j,int[][] dp) {
        if (i >= grid.length || j >= grid[0].length || j < 0)return Integer.MAX_VALUE;
        if (i == grid.length - 1)return grid[i][j];
        if (dp[i][j] != -1)return dp[i][j];

        int ans = Integer.MAX_VALUE;
        for (int k = 0; k < grid[0].length; k++) {
            if (k == j){
                continue;
            }
            ans = Math.min(ans, minPath(grid,i + 1,k,dp));
        }
        return dp[i][j] = ans + grid[i][j];
    }
}
