package practise;

import java.util.Scanner;

public class Replace_Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        replace(n,k);
    }

    private static void replace(long n, long k) {
        String ans = "";
        int count = 0;
        while(n > 0){
            long r = n % 10;
            if (r == 0){
               ans = r+k+ans;
               count++;
            }
            else{
                ans = r + ans;
            }
            n = n/10;
        }
        if (count>0){
            System.out.println(Long.parseLong(ans));
        }else{
            System.out.println("Zero is not present");
        }
    }
}
