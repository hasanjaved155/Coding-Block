package assignment_3;

import java.util.Scanner;

public class PatternHourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            for (int j = n-i; j >= 0 ; j--) {
                System.out.print(j+"\t");
            }
            for (int j = 1; j <= n-i; j++) {
                // if (j!=0){
                //     System.out.print(j+"\t");
                // }
                System.out.print(j+"\t");

            }
            System.out.println();
        }

        for (int i = n-1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            for (int j = n-i; j >= 0 ; j--) {
                System.out.print(j+"\t");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j+"\t");

            }
            System.out.println();
        }
    }
}