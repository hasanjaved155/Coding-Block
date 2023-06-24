package lec52;

import java.util.Arrays;
import java.util.Scanner;

public class Zero_1_Knapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();

        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            size[i] = scanner.nextInt();
        }
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = scanner.nextInt();
        }
        int[][] dp = new int[n + 1][s + 1];
        for(int[] a : dp) {
            Arrays.fill(a, -1);
        }
        System.out.println(knapSack(size,value,0,s,dp));
    }

    private static int knapSack(int[] size, int[] value, int i,int capacity,int[][] dp) {
        if (i == size.length || capacity == 0){
            return 0;
        }
        if (dp[i][capacity] != -1){
            return dp[i][capacity];
        }
        int inc = 0;
        if (capacity >= size[i]){
            inc = knapSack(size,value,i + 1, capacity - size[i], dp) + value[i];
        }
        int exc = knapSack(size,value,i + 1, capacity, dp);
        return dp[i][capacity] =  Math.max(inc, exc);
    }
}
