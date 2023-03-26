package assignment_3;

import java.util.Scanner;

public class PatternMountain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1+"\t");
            }
            for (int j = 2*(n-i)-3; j > 0 ; j--) {
                System.out.print("\t");
            }
            for (int j = i; j >= 0 ; j--) {
                if (j!=n-1){
                    System.out.print(j+1+"\t");
                }
            }
            System.out.println();
        }
    }
}