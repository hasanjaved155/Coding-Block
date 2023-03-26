package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Product_Numbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(maximunProduct(arr));
    }

    private static int maximunProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int ans = arr[i] * arr[i + 1];
            for (int j = i + 2; j < arr.length; j++) {
                ans = ans * arr[j];
                max = Math.max(max,ans);
                ans = arr[i] * arr[i + 1];
            }
        }
        return max;
    }
}
