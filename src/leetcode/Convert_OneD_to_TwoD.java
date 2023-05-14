package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Convert_OneD_to_TwoD {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int m = 2;
        int n = 2;

        int[][] ans = convert(arr,m,n);
        System.out.println(Arrays.toString(ans));
    }

    private static int[][] convert(int[] arr, int m, int n) {
        int[][] convert = new int[m][n];
        if (m * n != arr.length) return new int[0][0];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                convert[i][j] = arr[k];
                k++;
            }
        }
        return convert;
    }
}

