package lec5;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;

        int i = 1;
        while(i<=n){
            int c = a+b;
            a=b;
            b=c;
            i++;
        }
        System.out.println(a);
    }
}
