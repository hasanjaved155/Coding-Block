package assignment_8;

import java.util.Scanner;

public class String_Toggle_Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();

        toggle(s);
        System.out.println(String.valueOf(s));
    }

    private static void toggle(char[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'A' && s[i] <= 'Z')
                s[i] = (char) (s[i] + 'a' - 'A');
            else if (s[i] >= 'a' && s[i] <= 'z')
                s[i] = (char) (s[i] + 'A' - 'a');
        }
    }
}
