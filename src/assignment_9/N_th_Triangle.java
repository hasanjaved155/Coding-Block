package assignment_9;

import java.util.Scanner;

public class N_th_Triangle {

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
