package assignment_5;

import java.util.Scanner;

public class Product_Self {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        long [] ans = productExceptSelf(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    private static long[] productExceptSelf(int[] nums) {
        int n = nums.length;

        long [] left = new long[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        long [] right = new long[n];
        right[n-1] = 1;
        for (int i = n-2; i >= 0 ; i--) {
         right[i] = right[i+1] * nums[i+1];
        }

        long [] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = left[i] * right[i];
        }
        return arr;
    }
}
