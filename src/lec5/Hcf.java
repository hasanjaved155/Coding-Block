package lec5;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        int divident = scanner.nextInt();

        while(divident%divisor!=0){
            int r = divident%divisor;
            divident = divisor;
            divisor = r;
        }
        System.out.println(divisor);
    }
}
