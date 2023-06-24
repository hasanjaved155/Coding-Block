package dp_leetcode;

import java.util.Arrays;

public class Minimum_ASCII_Delete_Sum_Arrays {
    public static void main(String[] args) {
        String s1 = "delete";
        String s2 = "leet";

        System.out.println(minimumDeleteSum(s1,s2));
    }

    private static int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int[] a : dp){
            Arrays.fill(a,-1);
        }
        return minimumSum(s1,s2,0,0,dp);
    }

    private static int minimumSum(String s1, String s2, int i, int j,int[][] dp) {
        if (i == s1.length() && j == s2.length()){
            return 0;
        }
        if (dp[i][j] != -1)return dp[i][j];
        if (i == s1.length()){
            return (int) s2.charAt(j) + minimumSum(s1,s2,i,j + 1,dp);
        }
        if (j == s2.length()){
            return (int) s1.charAt(i) + minimumSum(s1,s2,i + 1,j,dp);
        }
        int ans = 0;
        if (s1.charAt(i) == s2.charAt(j)){
            ans = minimumSum(s1,s2,i + 1,j + 1,dp);
        }else {
            int ans1 = (int) s1.charAt(i) + minimumSum(s1,s2,i + 1,j,dp);
            int ans2 = (int) s2.charAt(j) + minimumSum(s1,s2,i,j + 1,dp);
            ans = Math.min(ans1,ans2);
        }
        return dp[i][j] =  ans;
    }
}
