package lec51_Dynamic_Programming;

public class Fibonaccii {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        System.out.println(fibotd(n, dp));
        System.out.println(fibobu(n));
    }

    //-------------------------Top-Down-Approach(Memorization)--------------------------//
    private static int fibotd(int n, int[] dp) {
        if (n == 0 || n == 1)return n;

        if (dp[n] != 0)return dp[n];// check previous value if exist
        int f1 = fibotd(n - 1, dp);
        int f2 = fibotd(n - 2, dp);
        dp[n] = f1 + f2;// yaad kiya hai
        return f1 + f2;
    }

    //--------------------------Bottom-Up-Approach(Iterative)----------------------//
    private static int fibobu(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
