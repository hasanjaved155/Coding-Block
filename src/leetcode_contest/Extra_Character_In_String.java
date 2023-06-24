package leetcode_contest;

import java.util.HashSet;

public class Extra_Character_In_String {
    public static void main(String[] args) {
        String s = "leetscode";
        String[] dictionary = {"leet", "code", "leetcode"};
        System.out.println(minExtraChar(s, dictionary));
    }

    private static int minExtraChar(String s, String[] dictionary) {
        HashSet<String>dict = new HashSet<>();
        for (String word : dictionary){
            dict.add(word);
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 0;
        for (int i = 1; i <= s.length() ; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = i; j >= 1 ; j--) {
                String st = s.substring(j - 1, i);
                if (dict.contains(st)){
                    dp[i] = Math.min(dp[i], dp[j - 1]);
                }
            }
        }
        return dp[s.length()];
    }
}
