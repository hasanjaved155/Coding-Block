package lec20;

import assignment_8.String_String_Comparison;

import java.util.Scanner;

public class Tavas_Saddas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(tavas_Saddas(str));
    }

    private static int tavas_Saddas(String str) {
        int n = str.length();
        int count = (1 << n) - 2;
        int pos = 0;
        for (int i = str.length() - 1; i >= 0 ; i--) {
           if (str.charAt(i) == '7'){
               count = count + (1 << pos);
           }
           pos ++;
        }
        return count + 1;
    }
}
