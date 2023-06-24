package lec52;

import java.util.Arrays;

public class Edit_Distance {
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        System.out.println(minDistance(word1, word2));
    }

    private static int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for (int[] a : dp){
            Arrays.fill(a, - 1);
        }
        return minDis(word1, word2, 0 , 0, dp);
    }

    private static int minDis(String word1, String word2, int i, int j, int[][] dp) {
        if (i == word1.length()){
            return word2.length() - j;
        }
        if (j == word2.length()){
            return word1.length() - i;
        }
        if (dp[i][j] != -1)return dp[i][j];
        int ans = 0;
        if (word1.charAt(i) == word2.charAt(j)){
            ans = minDis(word1, word2, i + 1, j + 1, dp);
        }else {
            int ins = minDis(word1, word2, i, j + 1, dp);
            int del = minDis(word1, word2, i + 1, j , dp);
            int rem = minDis(word1, word2, i + 1, j + 1, dp);

            ans = Math.min(ins, Math.min(del, rem)) + 1;
        }
        return dp[i][j] = ans;
    }
}
