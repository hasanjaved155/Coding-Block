package lec5;

import java.util.Scanner;

public class PascalTriangle_Pattern_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 0;
        int col = 0;
        while (row<n){
           int i = 0;
           int val = 1;
           while (i<=col){
               System.out.print(val+" ");
               val = (val*(row-i))/(i+1);
               i++;
           }
            System.out.println();
           row++;
           col++;
        }
    }
}
