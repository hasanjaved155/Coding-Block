package dp_leetcode;

import java.util.Arrays;

public class Stone_Game {
    public static void main(String[] args) {
        int[] piles = {3,7,2,3};
        System.out.println(stoneGame(piles));
    }

    private static boolean stoneGame(int[] piles) {
        int[][] dp = new int[piles.length + 1][piles.length + 1];
        for (int[] a : dp){
            Arrays.fill(a,-1);
        }
        int ans = stoneMax(piles,0,piles.length - 1,dp);
        return ans > 0;
    }

    private static int stoneMax(int[] piles, int start, int end, int[][] dp) {
        if (start >= end)return 0;

        if (dp[start][end] != -1)return dp[start][end];
        int a1 = piles[end];
        int a2 = stoneMax(piles,start,end - 2,dp);
        int a3 = stoneMax(piles,start + 1,end - 1,dp);
        int ans = Math.min(a2,a3);
        int p1 = ans + a1;

        int b1 = piles[start];
        int b2 = stoneMax(piles,start + 2,end,dp);
        int b3 = stoneMax(piles,start + 1,end - 1,dp);
        int ans2 = Math.min(b2,b3);
        int p2 = ans2 + b1;

        return dp[start][end] = Math.max(p1,p2);
    }
}
