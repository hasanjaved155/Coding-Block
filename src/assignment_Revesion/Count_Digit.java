package assignment_Revesion;

import java.util.Scanner;

public class Count_Digit {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int d = scanner.nextInt();
        count(n,d);
        System.out.println();
        System.out.println(count);
    }

    private static void count(String n, int d) {
        if (n.length() == 0)return;

        int digit = n.charAt(0) - '0';
        if (digit == d)count++;
        count(n.substring(1),d);
    }
}
