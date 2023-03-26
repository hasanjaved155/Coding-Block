package assignment_9;

import java.util.Scanner;

public class Subsequence_Recursion {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        subsequence(s,"");
        System.out.println();
        System.out.println(count);
    }

    private static void subsequence(String s,String ans) {
        if (s.length() == 0){
            System.out.print(ans + " ");
            count++;
            return;
        }

        char ch = s.charAt(0);
        subsequence(s.substring(1),ans);
        subsequence(s.substring(1),ans + ch);
    }
}
