package leetcode;

import java.util.Scanner;

public class Longest_Continous_Increasing_Subsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findLengthOfLCIS(arr));
    }

    private static int findLengthOfLCIS(int[] arr) {
        int count = 1;
        int ans = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]){
                count++;
                ans = Math.max(count,ans);
            }
            else{
                count = 1;
            }
        }
        return ans;
    }
}
