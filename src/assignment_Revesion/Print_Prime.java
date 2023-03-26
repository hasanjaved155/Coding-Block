package assignment_Revesion;

import java.util.Scanner;

public class Print_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        prime(n);
    }

    private static void prime(long n) {

        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= n ; j++) {
                if (i % j == 0)count++;
            }
            if (count == 1){
                System.out.println(i);
            }
        }
    }
}
