package lec16;

import java.util.Scanner;

public class Split_Trim_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String ans = reverseWords(s);
        System.out.println(ans);
    }

    private static String reverseWords(String s) {
        s = s.trim();
        String [] arr = s.split("\s+");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        return "";
    }
}
