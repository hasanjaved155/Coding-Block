package assignment_10_Recursion_BackTracking;

import java.util.Scanner;

public class Nth_Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        System.out.println(nthTriangle(n));
    }

    private static int nthTriangle(int n) {
        if (n == 1)return 1;

        return n + nthTriangle(n-1);
    }
}

