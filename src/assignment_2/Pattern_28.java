package assignment_2;

import java.util.Scanner;

public class Pattern_28 {
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
                System.out.print(row-1+l+" ");
                l++;
            }

            int k = row;
            int t = 1;
            while(k>t){
                System.out.print(row-1+k-1+" ");
                k--;
            }
            System.out.println();
            row++;
            star++;
            space--;

        }
    }
}
