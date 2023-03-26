package lec14;

import java.util.Scanner;

public class Spiral_Wave {
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

        spiral_Wave(arr);//clock_wise_spiral_wave
        System.out.print("END");
    }

    private static void spiral_Wave(int[][] arr) {
        int minc = 0;
        int minr = 0;
        int maxc = arr[0].length-1;
        int maxr = arr.length-1;
        int total = 0;

        while (total < arr.length*arr[0].length) {
            for (int i = minc; i <= maxc && total < arr.length*arr[0].length ; i++) {
                System.out.print(arr[minr][i] + ", ");
                total++;
            }
            minr++;
            for (int i = minr; i <= maxr && total < arr.length*arr[0].length; i++) {
                System.out.print(arr[i][maxc] + ", ");
                total++;
            }
            maxc--;
            for (int i = maxc; i >= minc && total < arr.length*arr[0].length; i--) {
                System.out.print(arr[maxr][i] + ", ");
                total++;
            }
            maxr--;
            for (int i = maxr; i >= minr && total < arr.length*arr[0].length; i--) {
                System.out.print(arr[i][minc] + ", ");
                total++;
            }
            minc++;
        }
    }
}
