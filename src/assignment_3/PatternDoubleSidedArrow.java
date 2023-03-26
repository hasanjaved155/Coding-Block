package assignment_3;

import java.util.Scanner;

public class PatternDoubleSidedArrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = (n+1)/2;
        for (int i = 1; i <= m ; i++) {
            for (int j = 0; j < 2*(m-i) ; j++) {
                System.out.print("\t");

            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+"\t");
            }
            for (int j = 0; j < 2*i-3; j++) {
                System.out.print("\t");
            }
            if (i!=1){
                for (int j = 1; j <=i; j++) {
                    System.out.print(j + "\t");
                }
            }

            System.out.println();
        }
        for (int i = m-1; i >= 1 ; i--) {
            for (int j = 0; j < 2*(m-i) ; j++) {
                System.out.print("\t");

            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+"\t");
            }
            for (int j = 0; j < 2*i-3; j++) {
                System.out.print("\t");
            }
            if (i!=1){
                for (int j = 1; j <=i; j++) {
                    System.out.print(j + "\t");
                }
            }

            System.out.println();
        }

    }
}
