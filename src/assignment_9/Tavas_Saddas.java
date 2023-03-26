package assignment_9;

import java.util.Scanner;

public class Tavas_Saddas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(tavas(s));
    }

    private static int tavas(String s) {
        int n = s.length();
        int count = (1 << n) - 2;
        int pos = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i)=='7'){
                count = count + (1 << pos);
            }
            pos++;
        }
        return count+1;
    }
}
