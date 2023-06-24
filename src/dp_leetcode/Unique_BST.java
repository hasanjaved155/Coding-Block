package dp_leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Unique_BST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(numTrees(n));
    }

    private static int numTrees(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, - 1);
        return allTrees(n,dp);
    }

    private static int allTrees(int n, int[] dp) {
        if (n <= 1)return 1;

        if (dp[n] != -1)return dp[n];

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += allTrees(i - 1, dp) * allTrees(n - i, dp);
        }
        return dp[n] = ans;
    }
}
