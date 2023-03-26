package assignment_3;

import java.util.Scanner;

public class PatternNumberLadder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k+"\t");
                k++;
            }
            System.out.println();
        }
    }
}
