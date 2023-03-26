package lec14;

import java.util.Scanner;

public class Anti_Diagonal_Wave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        anti_Diadonal(arr);
    }

    private static void anti_Diadonal(int[][] arr) {
        int n = arr.length;
        for (int j = 0; j < n; j++) {
            int col = j;
            int row = 0;
            while(col >= 0 && row < n){
                System.out.print(arr[row][col]+" ");
                col--;
                row++;
            }
            System.out.println();
        }

        for (int i = 1; i < n ; i++) {
            int row = i;
            int col = n-1;
            while (row < n && col >= 0){
                System.out.print(arr[row][col]+" ");
                col--;
                row++;
            }
            System.out.println();
        }
    }
}
