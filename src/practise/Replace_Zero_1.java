package practise;

import java.util.Scanner;

public class Replace_Zero_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long k = scanner.nextInt();

        replace(n,k);
    }

    private static void replace(long n, long k) {
       long ans = 0;
       long mul = 1;
       int count = 0;
       while(n>0){
           long rem = n % 10;
           if (rem==0) {
               ans = ans + k * mul;
               count++;
           }else{
               ans = ans + rem*mul;
           }
           n = n/10;
           mul = mul*10;
       }
       if (count>0){
           System.out.println(ans);
       }else{
           System.out.println("Zero is not present");
       }
    }
}
