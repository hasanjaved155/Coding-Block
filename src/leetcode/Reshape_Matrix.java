package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Reshape_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int [][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int [][] ans = matrixReshape(arr,r,c);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] matrixReshape(int[][] arr, int r, int c) {
        int [][] matrix = new int[r][c];
        int row = 0;
        int col = 0;
        if (r == arr.length && c == arr[0].length)return arr;
        if (arr.length * arr[0].length < r * c)return arr;
        if (arr.length * arr[0].length > r * c)return arr;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                matrix[row][col] = arr[i][j];
                col++;
                if (col == c){
                    row ++;
                    col = 0;
                }
            }
        }
        return matrix;
    }
}
