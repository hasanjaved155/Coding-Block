package leetcode;

import java.util.Scanner;

public class Toeplitz_Matrix {
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
        int i = 0;
        int j = 0;
        while(i < arr.length) {
            if (j == arr[0].length){
                i++;
                j = 0;
            }
            int k = i;
            int l = j;

            while (k < arr.length - 1 && l + 1 < arr[0].length) {
                if (arr[k][l] != arr[k + 1][l + 1]) {
                    return false;
                }
                k++;
                l++;
            }
            j++;
        }
        return true;
    }
}
