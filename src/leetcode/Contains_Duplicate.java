package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Contains_Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean ans = single_Number(arr);
        System.out.println(ans);
    }

    private static boolean single_Number(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])return true;
        }
        return false;
    }
}