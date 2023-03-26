package assignment_Revesion;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        int divident = scanner.nextInt();

        System.out.println(gcd(divisor,divident));
    }

    private static int gcd(int divisor, int divident) {
        int x = divisor;
        int y = divident;

        while(divident % divisor > 0){
            int r = divident % divisor;
            divident = divisor;
            divisor = r;
        }
        int gcd = divisor;
        //System.out.println(gcd);
        //int lcm = (x * y)/ gcd;
        //return lcm;
        return (x * y)/ gcd;
    }
}
