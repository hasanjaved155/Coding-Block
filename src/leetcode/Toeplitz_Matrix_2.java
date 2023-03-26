package leetcode;

import java.util.Scanner;

public class Toeplitz_Matrix_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(isToeplitzMatrix(arr));
    }

    private static boolean isToeplitzMatrix(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[0].length - 1; j++) {
                if (arr[i][j] != arr[i + 1][j + 1])return false;
            }
        }
        return true;
    }
}
