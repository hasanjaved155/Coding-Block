package assignment_7;

import java.util.Scanner;

public class Boolean_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int [][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int [][] ans = boolean_Matrix(arr,m,n);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] boolean_Matrix(int[][] arr, int m, int n) {
        int [] row = new int[m];
        for (int i = 0; i < m; i++) {
            row[i] = 0;
        }
        int [] col = new int[n];
        for (int i = 0; i < n; i++) {
            col[i] = 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1)
                    arr[i][j] = 1;
            }
        }
        return arr;
    }
}
