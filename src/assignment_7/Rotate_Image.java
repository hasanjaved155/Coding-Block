package assignment_7;

import java.util.Scanner;

public class Rotate_Image {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j]= scanner.nextInt();
            }
        }

        for (int j = n-1; j >= 0 ; j--) {
            for (int i = 0; i < n ; i++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
