package assignment_8;

import java.util.Scanner;

public class ASCII_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] ch = scanner.nextLine().toCharArray();

        ascii(ch);
    }

    private static void ascii(char[] ch) {
        for (int i = 0; i < ch.length-1; i++) {
            System.out.print(ch[i]);
            int diff = ch[i + 1] - ch[i];
            System.out.print(diff);
        }
        System.out.print(ch[ch.length-1]);
    }
}
