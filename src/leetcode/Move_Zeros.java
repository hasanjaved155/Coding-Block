package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Move_Zeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        moveZeros(arr);
    }

    private static void moveZeros(int[] arr) {
        int [] arr2 = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                arr2[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
