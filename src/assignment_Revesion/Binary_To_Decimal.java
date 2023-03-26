package assignment_Revesion;

import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(conversion(n));
    }

    private static int conversion(int n) {
        String s = String.valueOf(n);
        int i = s.length()-1;
        int ans = 0;
        int base = 1;
        while(i >= 0){
            int digit = s.charAt(i) - '0';
            ans = ans + digit*base;
            base = base * 2;
            i--;
        }
        return ans;
    }
}
