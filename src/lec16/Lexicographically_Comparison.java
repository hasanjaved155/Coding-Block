package lec16;

import java.util.Scanner;

public class Lexicographically_Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int ans = lexicographical(s1,s2);
        System.out.println(ans);

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));
    }

    private static int lexicographical(String s1, String s2) {
        int len = Math.min(s1.length(),s2.length());

        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }
}
