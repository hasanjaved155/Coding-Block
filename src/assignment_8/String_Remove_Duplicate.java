package assignment_8;

import java.util.Scanner;

public class String_Remove_Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        comparison(s);
    }

    private static void comparison(String s) {
        for (int i = 0; i < s.length();) {
            int count = 1;
            while (i + count < s.length() && s.charAt(i) == s.charAt(i + count))count ++;

            System.out.print(s.charAt(i));
            System.out.print(count);
            i = i + count;

        }
    }
}
