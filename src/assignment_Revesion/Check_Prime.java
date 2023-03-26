package assignment_Revesion;

import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        prime(n);
    }

    private static void prime(long n) {

        int m = 100;
        int count = 0;

        for (int i = 2; i <= m; i++) {
            if (n % i == 0)count++;
        }
        if (count > 1){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}
