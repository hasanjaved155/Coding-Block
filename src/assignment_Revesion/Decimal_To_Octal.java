package assignment_Revesion;

import java.util.Scanner;

public class Decimal_To_Octal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(conversion(n));
    }

    private static int conversion(int n) {
        String ans = "";

        while(n > 0){
            int r = n % 8;
            ans = r + ans;
            n = n / 8;
        }
        return Integer.parseInt(ans);
    }
}
