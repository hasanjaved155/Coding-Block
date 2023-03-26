package string;

import java.util.Scanner;

public class Mapped_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        mapped("",str);
    }

    private static void mapped(String ans, String str) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        int d1 = str.charAt(0) - '0';
        char s1 = (char) (d1 - 1 + 'A');
        mapped(ans + s1, str.substring(1));

        if (str.length() >= 2) {
            int d2 = (str.charAt(0) - '0') * 10 + str.charAt(1) - '0';
            if (d2 >= 10 && d2 <= 26) {
                char s2 = (char) (d2 - 1 + 'A');
                mapped(ans + s2, str.substring(2));
            }
        }
    }
}
