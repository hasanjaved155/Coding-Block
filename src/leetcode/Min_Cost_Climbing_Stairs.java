package leetcode;

import java.util.Scanner;

public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(minCostClimbingStairs(arr));
    }

    private static int minCostClimbingStairs(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return Math.min(minCost(arr,n-1,dp),minCost(arr,n-2,dp));
    }

    private static int minCost(int[] arr, int n,int[] dp) {
        if (n < 0)return 0;
        if (n == 0 || n == 1) return arr[n];

        if (dp[n] != -1)return dp[n];

        return dp[n] = Math.min(minCost(arr,n-1,dp),minCost(arr,n-2,dp)) + arr[n];
    }
}
