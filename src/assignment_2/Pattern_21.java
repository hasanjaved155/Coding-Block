package assignment_2;

import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 1;
        int star = 1;
        int space = 2*n-3;
        while (row<=n){
            int i = 1;

            while (i<=star){
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int l = 1;
//            if (row==n){
//                l=2;
//            }
            while(l<=star && l!=n){
                System.out.print("* ");
                l++;
            }

            System.out.println();
            row++;
            star++;
            space-=2;
        }
    }
}
