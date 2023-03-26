package assignment_2;

import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 1;
        int star = n;
        int space = -1;
        while (row<=2*n-1){
            int i = 1;
            while (i<=star && i!=n){
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int l = 1;
//            if (row==1){
//                l=2;
//            }
            while(l<=star){
                System.out.print("* ");
                l++;
            }
            if(row<n){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }

            System.out.println();
            row++;
        }
    }
}
