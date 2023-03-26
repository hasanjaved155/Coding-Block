package assignment_3;

import java.util.Scanner;

public class PatternMagic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j >= 0; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < (2*i)-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n-i-1; j++) {
                if (j!= n-1){
                    System.out.print("*");
                }
                //System.out.print("*\t");

            }
            System.out.println();
        }
        for (int i = n-2; i >= 0; i--) {
            for (int j = n-i-1; j >= 0; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < (2*i)-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n-i-1; j++) {
                if (j!= n-1){
                    System.out.print("*");
                }
                //System.out.print("*\t");

            }
            System.out.println();
        }
    }
}