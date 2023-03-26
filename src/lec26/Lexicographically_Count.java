package lec26;

import java.util.Scanner;

public class Lexicographically_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        count(0,n);
    }

    private static void count(int start, int end) {
        if (start > end)return;

        System.out.print(start + " ");
        int i = 0;
        if (start == 0)i = 1;

        for (; i <= 9; i++) {
            count(start * 10 + i, end);
        }
    }
}
