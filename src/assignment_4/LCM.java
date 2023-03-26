package assignment_4;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        int divident = scanner.nextInt();
        int gcd = divisor;
        int lcd = divident;




        int hcf = hff(gcd,lcd);
        //System.out.println(gcd);
        int lcm = (divisor*divident)/hcf;
        System.out.println(lcm);
    }

    private static int hff(int gcd, int lcd) {

        while(lcd%gcd!=0){
            int r = lcd%gcd;
            lcd = gcd;
            gcd = r;
        }
        return gcd;
    }
}
