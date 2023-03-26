package assignment_3;

import java.util.Scanner;

public class MirrorStarPattern_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = (n+1)/2;

        for (int i = 0; i < m; i++) {
            for (int j = m-i-1; j > 0 ; j--) {
                System.out.print("\t");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = m-2; i >= 0; i--) {
            for (int j = m-i-1; j > 0 ; j--) {
                System.out.print("\t");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}