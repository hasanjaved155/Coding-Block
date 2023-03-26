package assignment_3;

import java.util.Scanner;

public class PatternRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j = n-i-1; j > 0 ; j--) {
                System.out.print("\t");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i+j+1+"\t");
            }
            for (int j = i; j >= 0 ; j--) {
                if (j!=i){
                    System.out.print(i+j+1+"\t");
                }

            }
            System.out.println();
        }
        for (int i = n-2; i >= 0 ; i--) {
            for (int j = n-i-1; j > 0 ; j--) {
                System.out.print("\t");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i+j+1+"\t");
            }
            for (int j = i; j >= 0 ; j--) {
                if (j!=i){
                    System.out.print(i+j+1+"\t");
                }

            }
            System.out.println();
        }
    }
}