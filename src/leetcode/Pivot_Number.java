package leetcode;

import java.util.Scanner;

public class Pivot_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(pivotIndex(arr));
    }

    private static int pivotIndex(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr.length - 1] - arr[i] == ans)return i;
            else ans = arr[i];
        }
        return -1;
    }
}
