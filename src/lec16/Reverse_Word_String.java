package lec16;

import java.util.Scanner;

public class Reverse_Word_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String ans = reverseWords(s);
        System.out.println(ans);
    }

    private static String reverseWords(String s) {
        s = s.trim();
        String [] arr = s.split("\s+");
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i]+" ";
        }
        return ans.trim();
    }
}
