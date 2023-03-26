package assignment_2;

import java.util.Scanner;

public class Pattern_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int row = 1;

        int space = n;

        while (row <=n) {

            int j = 1;
            while(j<space){
                System.out.print("  ");
                j++;
            }

            int k = 1;
            while(k<=(2*row)-1){
                if (k==1 || k == (2*row)-1){
                    System.out.print(row+" ");
                }else{
                    System.out.print(0+" ");
                }
                k++;
            }
            System.out.println();
            row++;

            space--;

        }

    }
}

