package leetcode;

import java.util.Scanner;

public class Buy_And_Sell_2 {
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
         int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]){
                max = max + (prices[i] - prices[i - 1]);
            }
        }
        return max;
    }
}
