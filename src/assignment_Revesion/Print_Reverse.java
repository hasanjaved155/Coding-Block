package assignment_Revesion;

import java.util.Scanner;

public class Print_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        print_Reverse(n);
    }

    private static void print_Reverse(int n) {

        while (n > 0){
            int r = n % 10;
            n = n / 10;
            System.out.print(r);
        }
    }
}
