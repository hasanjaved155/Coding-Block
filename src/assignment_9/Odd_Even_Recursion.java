package assignment_9;

import java.util.Scanner;

public class Odd_Even_Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        odd(n);
        even(1,n);
    }
    private static void odd(int n) {
        if (n == 0)return;
        if (n % 2 != 0){
            System.out.println(n);
        }
        odd(n - 1);
    }
    private static void even(int x,int n) {
        if (x > n)return;

        if (x % 2 == 0){
            System.out.println(x);
        }
        even(x + 1,n);
    }
}
