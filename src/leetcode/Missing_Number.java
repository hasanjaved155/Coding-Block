package leetcode;

import java.util.Scanner;

public class Missing_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr) {
        int k = arr.length;
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans = ans ^ arr[i];
        }
        int ans2 = 0;
        for (int i = 0; i <= k; i++) {
            ans2 = ans2 ^ i;
        }
        return ans ^ ans2;
    }
}
