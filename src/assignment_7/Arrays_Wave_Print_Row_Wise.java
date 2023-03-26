package assignment_7;

import java.util.Scanner;

public class Arrays_Wave_Print_Row_Wise {
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

        vertical_Wave(arr);
        System.out.print("END");
    }

    private static void vertical_Wave(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j]+", ");
                }
            }else{
                for (int j = arr[0].length - 1; j >= 0 ; j--) {
                    System.out.print(arr[i][j]+", ");
                }
            }
        }
    }
}
