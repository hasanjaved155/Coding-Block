package lec52;

import java.util.Arrays;
import java.util.Scanner;

public class Valentine_Magic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] choc = new int[n];// boys have chocolates
        for (int i = 0; i < n; i++) {
            choc[i] = scanner.nextInt();
        }
        int[] can = new int[m];// girls have candies
        for (int i = 0; i < m; i++) {
            can[i] = scanner.nextInt();
        }
        Arrays.sort(choc);
        Arrays.sort(can);
        int[][] dp = new int[choc.length + 1][can.length + 1];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        System.out.println(minPair(choc,can,0,0, dp));
    }

    private static int minPair(int[] choc, int[] can, int i, int j, int[][] dp) {
        if (i == choc.length){
            return 0;
        }
        if (j == can.length){
            return 10000000;
        }
        if (dp[i][j] != -1)return dp[i][j];

        int sel = Math.abs(choc[i] - can[j]) + minPair(choc, can, i + 1, j + 1, dp);
        int rej = minPair(choc, can, i , j + 1, dp);

        return dp[i][j] = Math.min(sel, rej);
    }
}
