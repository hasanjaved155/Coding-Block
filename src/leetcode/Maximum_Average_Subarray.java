package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Average_Subarray {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(findMaxAverage(arr,k));
    }

    private static double findMaxAverage(int[] arr,int k) {
        double max = Integer.MIN_VALUE;
        long l = k;
        for (int i = 0; i < arr.length - k + 1; i++) {
            double ans = 0;
            for (int j = i; j < l; j++) {
                ans = ans + arr[j];
            }
            ans = ans/k;
            max = Math.max(max,ans);
            l++;
        }
        return max;
    }
}
