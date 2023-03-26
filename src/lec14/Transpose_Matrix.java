package lec14;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int m = scanner.nextInt();
        int [][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int [][] ans = transpose(arr);
       // System.out.println(Arrays.toString(ans));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] transpose(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] transposedMatrix = new int[m][n];

        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++)
                transposedMatrix[i][j] = matrix[j][i];

        return transposedMatrix;
    }
}
