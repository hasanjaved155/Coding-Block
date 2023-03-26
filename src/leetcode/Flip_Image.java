package leetcode;

import java.util.Scanner;

public class Flip_Image {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int[][] ans = flipAndInvertImage(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] flipAndInvertImage(int[][] arr) {
         int i = 0;
         while(i < arr.length) {
             int j = 0;
             int k = arr.length - 1;
             while (j < k) {
                 int temp = arr[i][j];
                 arr[i][j] = arr[i][k];
                 arr[i][k] = temp;
                 j++;
                 k--;
             }
             i++;
         }
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[0].length; k++) {
                if (arr[j][k] == 0){
                    arr[j][k] = 1;
                }else{
                    arr[j][k] = 0;
                }
            }
        }
         return arr;
    }
}
