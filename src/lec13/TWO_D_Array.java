package lec13;

import java.util.Scanner;

public class TWO_D_Array {
    public static void main(String[] args) {
        //int [][] arr = null;// default value
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//no. of rows
        int m = scanner.nextInt();//no. of column

        int [][] arr = new int[n][m];
        //int [][] ar = new int[3][];//null pointer exception
        //int [][] ar = new int[][4];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
             Display(arr);
    }
    private static void Display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
