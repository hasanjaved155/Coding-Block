package assignment_Revesion;

import java.util.Scanner;

public class Conversion_Any {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sb = scanner.nextInt();
        int db = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(conversion(sb,db,n));
    }

    private static int conversion(int sb,int db,int n) {
        String s = String.valueOf(n);
        int i = s.length()-1;
        int ans = 0;
        int base = 1;
        while(i >= 0){
            int digit = s.charAt(i) - '0';
            ans = ans + digit*base;
            base = base * sb;
            i--;
        }

        String ans2 = "";

        while(ans > 0){
            int r = ans % db;
            ans2 = r + ans2;
            ans = ans / db;
        }
        return Integer.parseInt(ans2);
    }
}
