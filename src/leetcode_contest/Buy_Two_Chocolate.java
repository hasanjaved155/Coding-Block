package leetcode_contest;

import java.util.Arrays;

public class Buy_Two_Chocolate {
    public static void main(String[] args) {
        int[] prices = {98,54,6,34,66,63,52,39};
        int money = 62;
        System.out.println(buyChoco(prices, money));
    }

    private static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum = money;
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= sum){
                sum = sum - prices[i];
                count++;
            }
            if (count == 2){
                return sum;
            }
        }
        return money;
    }
}
