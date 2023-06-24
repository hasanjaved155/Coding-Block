package dp_leetcode;

import java.util.Arrays;

public class Decode_Ways {
    public static void main(String[] args) {
        String s = "1125";
        System.out.println(numDecodings(s));
    }
    public static int numDecodings(String s) {
        if(s.charAt(0) - '0' == 0)return 0;
        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp,-1);
        return codeStr(s,dp,0);
    }
    public static int codeStr(String str, int[] dp,int i) {
        if (i == str.length()){
            return 1;
        }

        if (dp[i] != -1)return dp[i];
        int ans1 = 0;
        int num1 = str.charAt(i) - '0';
        if(num1 != 0){
            ans1 += codeStr(str,dp,i + 1);
            if (str.length() - i >= 2) {
                String s2 = str.substring(i, i + 2);
                int num2 = Integer.parseInt(s2);
                if (num2 <= 26){
                   ans1 += codeStr(str,dp,i + 2);
                }
            }
        }
        return dp[i] = ans1;
    }
}
