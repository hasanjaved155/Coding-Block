package practise;

import java.util.Scanner;

public class Leap_Code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            leap(n);
        }
    }

    private static void leap(int n) {
        for (int i = 0; i <= n; i++) {
            int count = 0;

            String s = String.valueOf(i);
            if (s.length() == 1) {
                System.out.print(i + " ");
            } else {
                int j = 0;
                while (j < s.length()-1) {
                    count = 0;
                    int d1 = s.charAt(j) - '0';
                    int d2 = s.charAt(j+1) - '0';
                    if (d1 - d2 == 1 || d2 - d1 == 1) {
                        count++;
                        j++;
                    }else {
                        break;
                    }
                }
            }
            if (count == 1){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
}
