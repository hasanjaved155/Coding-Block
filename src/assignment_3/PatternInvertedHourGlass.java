package assignment_3;

import java.util.Scanner;

public class PatternInvertedHourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i<=n ; i++) {
            for (int j = n; j >=n-i; j--) {
                System.out.print(j+"\t");
            }
            int k = n-i;
            for (int j = 0; j < 2*k-1; j++) {
                System.out.print("\t");
            }
            for (int j = n-i; j <=n ; j++) {
                if(j!=0){
                    System.out.print(j+"\t");
                }

            }
            System.out.println();
        }
        for (int i =n-1; i>=0 ; i--) {
            for (int j = n; j >=n-i; j--) {
                System.out.print(j+"\t");
            }
            int k = n-i;
            for (int j = 0; j < 2*k-1; j++) {
                System.out.print("\t");
            }
            for (int j = n-i; j <=n ; j++) {
                if(j!=0){
                    System.out.print(j+"\t");
                }

            }
            System.out.println();
        }

    }
}
