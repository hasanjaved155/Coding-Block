package assignment_6;

import java.util.Arrays;
import java.util.Scanner;

public class Square_Root_Sorted_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long [] ans = square(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    private static long[] square(int[] arr, int n) {
        long [] square = new long[n];

        for (int i = 0; i < n; i++) {
            square[i] = (long) arr[i] * arr[i];
        }
        Arrays.sort(square);
        return square;
    }
}
