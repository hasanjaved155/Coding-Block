package lec52;

import java.util.Arrays;

public class Coin_Change_2 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 5;
        System.out.println(change(coins,amount));
    }

//    private static int change(int[] coins, int amount) {
//        int[][] dp = new int[coins.length][amount + 1];
//        for (int[] a : dp){
//            Arrays.fill(a, -1);
//        }
////        for (int i = 0; i < dp.length; i++) {
////            for (int j = 0; j < dp[0].length; j++) {
////                dp[i][j] = -1;
////            }
////        }
//        return noWays(coins,amount,0,dp);
//    }

    private static int noWays(int[] coins, int amount, int index,int[][] dp) {
        if (amount == 0)return 1;
        if (index == coins.length)return 0;

        if (dp[index][amount] != -1)return dp[index][amount];

        int inc = 0;
        int exc = 0;

        if (amount >= coins[index]){
            inc += noWays(coins, amount - coins[index],index,dp);
        }
        exc += noWays(coins, amount,index + 1,dp);
        return dp[index][amount] = inc + exc;
    }
    private static int change(int[] coins, int amount){
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int am = 1; am < dp[0].length; am++) {
                int inc = 0;
                int exc = 0;
                if (am >= coins[i - 1]){
                    inc += dp[i][am - coins[i - 1]];
                }
                exc += dp[i - 1][am];
                dp[i][am] = inc + exc;
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
