package assignment_2;

import java.util.Scanner;

public class Pattern_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 1;
        int star = 1;

        while(row<=n){
            int j = n;
            while(j>=star){
                System.out.print(j+" ");
                j--;
            }
            row++;
            System.out.println();

        }
    }
}
