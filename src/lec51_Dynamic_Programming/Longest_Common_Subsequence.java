package lec51_Dynamic_Programming;

import java.util.Arrays;

public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(lcs(text1,text2));
    }

    private static int lcs(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int[] a : dp){
            Arrays.fill(a, - 1);
        }
        return lcstd(text1, text2, 0,0, dp);
    }

    private static int lcstd(String text1, String text2,int i , int j, int[][] dp) {
        if (j == text2.length() || i == text1.length()){
            return 0;
        }
        if (dp[i][j] != -1)return dp[i][j];
        int ans = 0;
        if (text1.charAt(i) == text2.charAt(j)){
            ans = 1 + lcstd(text1, text2, i + 1, j + 1, dp);
        }
        else {
            int f = lcstd(text1, text2,i + 1, j, dp);
            int d = lcstd(text1, text2, i, j + 1, dp);
            ans = Math.max(f, d);
        }
        dp[i][j] = ans;
        return ans;
    }
    public static  int lcsbu(String text1, String text2){
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int ans = 0;
                if (text1.charAt(i - 1) == text2.charAt(j - 1)){
                    ans = 1 + dp[i - 1][j - 1];
                }else {
                    int f = dp[i - 1][j];
                    int d = dp[i][j - 1];
                    ans = Math.max(f, d);
                }
                dp[i][j] = ans;
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
