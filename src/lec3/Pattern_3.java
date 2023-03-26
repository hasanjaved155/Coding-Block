package lec3;

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 1;
        int star = n;
        while (row<=n){
            int i = 1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
            star--;
        }
    }
}
