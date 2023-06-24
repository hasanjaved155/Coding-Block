package lec53;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {
    public static void main(String[] args) {
       int[][] grid = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minFallingSum(grid));
    }

    private static int minFallingSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] a : dp){
            Arrays.fill(a , - 1);
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

        int ans1 = minPath(grid, i + 1 , j - 1,dp);//left
        int ans2 = minPath(grid, i + 1, j, dp);//down
        int ans3 = minPath(grid , i + 1, j + 1,dp);//right
        return dp[i][j] =  Math.min(ans1, Math.min(ans2, ans3)) + grid[i][j];
    }
}
