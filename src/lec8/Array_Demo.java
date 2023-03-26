package lec8;

import java.util.Scanner;

public class Array_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char [] ch = new char[n];
        for (int i = 0; i < n; i++) {
            ch[i] = (char) scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ch[i]+" ");
        }

        double [] d = new double[n];
        for (int i = 0; i < n; i++) {
            d[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(d[i]+" ");
        }
    }
}
