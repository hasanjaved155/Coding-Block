package assignment_2;

import java.util.Scanner;

public class Pattern_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 1;
        int space = n;
        int star = 1;


        while (row <= n) {
            int i = 1;
            while (i < space) {
                System.out.print("  ");
                i++;
            }
            int k = 1;

            while(k<=star){
                if (k==row){
                    System.out.print(0+" ");
                }else {
                    System.out.print(n-row+k+" ");
                }
                k++;

            }


            int j = 2;
            while (j <= star) {

                System.out.print(n-j+1+" ");
                j++;


            }
            System.out.println();
            row++;
            star++;
            space--;

        }
    }
}
