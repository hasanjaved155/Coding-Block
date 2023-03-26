package leetcode;

import java.util.Scanner;

public class Maximum_Average_Subarray_2 {
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
        double sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }
        double res = sum;
        for(int i = k; i < arr.length; i++){
            sum += arr[i] - arr[i-k];
            res = Math.max(res,sum);
        }
        return res / k;
    }
}
