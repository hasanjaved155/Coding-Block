package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Plus_One_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =  scanner.nextInt();
        }

        int [] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] plusOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (arr[i] < 9){
                arr[i] = arr[i] + 1;
                return arr;
            }
            arr[i] = 0;
        }
        arr = new int[arr.length + 1];
        arr[0] = 1;
        return arr;
    }
}
