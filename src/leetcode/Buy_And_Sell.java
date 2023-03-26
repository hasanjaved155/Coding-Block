package leetcode;

import java.util.Scanner;

public class Buy_And_Sell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(maxProfit(arr));
    }

    private static int maxProfit(int[] prices) {
         int min = Integer.MAX_VALUE;
         int max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i],min);
            max = Math.max(max,prices[i] - min);
        }
        return max;
    }
}
