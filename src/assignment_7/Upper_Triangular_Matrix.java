package assignment_7;

import java.util.Scanner;

public class Upper_Triangular_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        upper_Triangular(arr);
    }

    private static void upper_Triangular(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i > j)
                    System.out.print("0 ");
                else
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
