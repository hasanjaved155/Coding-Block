package lec52;

import java.util.Arrays;

public class Distinct_Subsequences {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(change(s,t));
    }

    private static int change(String s, String t) {
        int[][] dp = new int[s.length()][t.length() + 1];
        for (int[] a : dp){
            Arrays.fill(a, -1);
        }
//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                dp[i][j] = -1;
//            }
//        }
        return noWays(s,t,0,0,dp);
    }

    private static int noWays(String s, String t, int sindex,int tindex, int[][] dp) {
        if (tindex == t.length())return 1;
        if (sindex == s.length())return 0;


        if (dp[sindex][tindex] != -1)return dp[sindex][tindex];

        int inc = 0;
        int exc = 0;

        if (s.charAt(sindex) == t.charAt(tindex)){
            inc += noWays(s, t,sindex + 1,tindex + 1,dp);
        }
        exc += noWays(s, t,sindex + 1,tindex,dp);
        return dp[sindex][tindex] = inc + exc;
    }
}
