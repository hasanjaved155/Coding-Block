package assignment_2;

import java.util.Scanner;

public class Pattern_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 1;
        int star = 1;
        int num = 1;
        while (row <= (2 * n) - 1) {
            int i = 1;
                while (i <= star) {
                    if (i % 2 == 0) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print(num + " ");
                    }
                    i++;
                }

                if (row < n){
                    star+=2;
                    num++;
                }else{
                    star-=2;
                    num--;
                }
                System.out.println();
                row++;

        }
    }
}
