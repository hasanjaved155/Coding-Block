package assignment_2;

import java.util.Scanner;

public class Pattern_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 1;
        int star = 1;
        int  space = n;
        int count = 1;
        while(row<=n){
            int j = 1;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            int l = 1;
            while(l<=star){
                System.out.print(count+" ");
                l++;
                count++;
            }
            System.out.println();
            row++;
            star+=2;
            space--;

        }
    }
}
