package assignment_9;

import java.util.Scanner;

public class Ultra_Fast_Mathematics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            String temp = scanner.nextLine();
            String s1 = temp.split(" ")[0];
            String s2 = temp.split(" ")[1];

            ultra(s1,s2);
        }
    }

    private static void ultra(String s1, String s2) {

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) System.out.print(0);
            else System.out.print(1);
        }
        System.out.println();
    }
}
