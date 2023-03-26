package lec14;

import java.util.Scanner;

public class Vertical_Wave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int [][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        vertical_Wave(arr);
        System.out.print("END");
    }

    private static void vertical_Wave(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            if (j%2==0){
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j]+", ");
                }
            }else{
                for (int i = arr.length - 1; i >= 0 ; i--) {
                    System.out.print(arr[i][j]+", ");
                }
            }
        }
    }
}
