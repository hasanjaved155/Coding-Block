package lec51_Dynamic_Programming;

import java.util.Arrays;

public class Uncrossed_Lines {
    public static void main(String[] args) {
        int[] nums1 = {2,5,1,2,5};
        int[] nums2 = {10,5,2,1,5,2};
        //System.out.println(lcs(text1,text2));
        System.out.println(uncrossedbu(nums1, nums2));
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
    public static  int uncrossedbu(int[] nums1, int[] nums2){
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int ans = 0;
                if (nums1[i - 1] == nums2[j - 1]){
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
