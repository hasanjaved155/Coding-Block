package dp_leetcode;

import java.util.Arrays;

public class Climb_Stairs {
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(climb(n,dp));
        //System.out.println(climbStairs(n));
    }

    private static int climb(int n, int[] dp) {
        //-----------top down approach-------------//
        if (n == 0 || n == 1)return 1;
        if (dp[n] != -1){
            return dp[n];
        }
        int ans = climb(n - 1, dp) + climb(n - 2, dp);
        dp[n] = ans;
        return ans;
    }

    private static int climbStairs(int n) {
        //-----------bottom up approach------------//
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[dp.length - 1];
    }
}
