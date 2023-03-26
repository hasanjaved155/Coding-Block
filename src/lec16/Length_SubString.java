package lec16;

import java.util.Scanner;

public class Length_SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s =scanner.nextLine();

        length(s);
    }

    private static void length(String s) {

        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length() ; j++) {
                int i = j - len;
                System.out.println(s.substring(i,j));
            }
        }
    }
}
