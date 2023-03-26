package lec3;

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 1;
        int star = n;
        int  space = 0;
        while(row<=n){
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int l = 1;
            while(l<=star){
                System.out.print("* ");
                l++;
            }
            System.out.println();
            row++;
            star--;
            space+=2;

        }
    }
}
