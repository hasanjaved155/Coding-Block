package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int [] arr = new int[m + n];
        for (int i = 0; i < m + n; i++) {
            arr[i] = scanner.nextInt();
        }
        int [] arr_1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr_1[i] = scanner.nextInt();
        }

        merge(arr,m,arr_1,n);

    }

    private static void merge(int[] arr, int m, int[] arr_1, int n) {
//        int [] ans = new int[m + n];
//        for (int i = 0; i < m+n; i++) {
//            ans[i] = arr[i];
//        }
//        for (int i = 0; i < n; i++) {
//            ans[m + i] = arr_1[i];
//        }
//        Arrays.sort(ans);
//        System.out.println(Arrays.toString(ans));
        for (int i = 0; i < n; i++) {
            arr[m + i] = arr_1[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
