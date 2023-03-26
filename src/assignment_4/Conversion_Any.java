package assignment_4;

import java.util.Scanner;

public class Conversion_Any {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sb = scanner.nextInt();
        int db = scanner.nextInt();
        int num = scanner.nextInt();

        int ans = conversion(num, sb, db);
        System.out.println(ans);
    }

    private static int conversion(int num, int sb, int db) {
        int ans = 0;
        int mult = 1;
        while (num != 0) {
            int rem = num % 10;
            ans = ans + rem * mult;
            mult = mult * sb;
            num = num / 10;
        }

        mult = 1;
        num = ans;
        ans = 0;



        while (num != 0) {
            int rem = num % db;
            ans = ans + rem * mult;
            mult = mult * 10;
            num = num / db;
        }
        return ans;
    }
}



