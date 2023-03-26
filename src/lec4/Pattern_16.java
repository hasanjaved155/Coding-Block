package lec4;

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 1;
        int star = n;
        int  space = n;
        while(row<=2*n-1){
            int j = 1;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            int l = 1;
            while(l<=star){
                System.out.print("* ");
                l++;
            }
            if (row<n){
                star--;
                space--;
            }else{
                star++;
                space++;
            }
            System.out.println();
            row++;


        }
    }
}
