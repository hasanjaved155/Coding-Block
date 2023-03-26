package assignment_8;

import java.util.Scanner;

public class String_Odd_Even_Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();

        toggle(s);
        System.out.println(String.valueOf(s));
    }

    private static void toggle(char[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z' && i % 2 ==0) {
                s[i] = (char) (s[i] + 'b' - 'a');
            }else s[i] = (char) (s[i] - ('b' - 'a'));
        }
    }
}
