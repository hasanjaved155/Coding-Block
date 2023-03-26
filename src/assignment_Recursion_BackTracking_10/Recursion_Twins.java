package assignment_Recursion_BackTracking_10;

import java.util.Scanner;
public class Recursion_Twins {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        recursionTwins(str, 0);
        System.out.println(count);
    }

    private static void recursionTwins(String str, int i) {
        if (i >= str.length() - 2) return;
        boolean b = str.charAt(i) == str.charAt(i + 2);
        if (b) {
            count++;
            recursionTwins(str, i + 1);
        } else {
            recursionTwins(str, i + 1);
        }
    }
}
