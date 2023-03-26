package lec3;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 1;
        int star = 1;
        int  space = n;
        while(row<=n){
            int j = 1;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            int l = 1;
            while(l<=star){
                if (l%2==0){
                    System.out.print("! ");
                }else {
                    System.out.print("* ");
                }
                l++;
            }
            System.out.println();
            row++;
            star+=2;
            space--;

        }
    }
}
