package assignment_4;

import java.util.Scanner;

public class PrimeNumber_3 {
    static int count;
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 2; i <= N; i++) {

            count = 0;

            isPrime(i);
        }
    }
        static void isPrime ( int n){

            for (int i = 2; i <= n; i++) {

                if (n % i == 0) count++;
            }
            if (count==1) System.out.println(n);
        }
    }
