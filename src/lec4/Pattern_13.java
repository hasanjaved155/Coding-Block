package lec4;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 1;
        int star = 1;
        while (row <= 2*n-1) {
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            if (row<n){
                star++;
            }else{
                star--;
            }
            System.out.println();
            row++;
        }
    }
}
