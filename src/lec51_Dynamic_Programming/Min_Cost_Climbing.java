package lec51_Dynamic_Programming;

public class Min_Cost_Climbing {
    public static void main(String[] args) {
        int[] arr = {1,100,1,1,1,100,1,1,100,1};

        System.out.println(minCost(arr));
    }

    private static int minCost(int[] arr) {

        return Math.min(minCostClimb(arr,arr.length - 1),minCostClimb(arr,arr.length - 2));
    }

    private static int minCostClimb(int[] arr, int n) {
        if (n < 0)return 0;
        if (n == 0 || n == 1) return arr[n];

        int[] dp = new int[n + 1];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = arr[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return dp[dp.length - 1];
    }
}
