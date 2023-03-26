package assignment_6;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        int ans = binarySearch(arr, n, k);
        System.out.println(ans);
    }
    private static int binarySearch(int[] arr, int n, int k) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] > k) end = mid - 1;
            else if (arr[mid] < k) start = mid + 1;
            else return mid;
        }
        return -1;
    }
}
