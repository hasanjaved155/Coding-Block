package dp_leetcode;

public class Perfect_Square {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(numSquares(n));
    }

    private static int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i ; j++) {
                int rem = i - j * j;
                if (dp[rem] < min){
                    min = dp[rem];
                }
            }
            dp[i] = min + 1;
        }
        return dp[n];
    }
}
