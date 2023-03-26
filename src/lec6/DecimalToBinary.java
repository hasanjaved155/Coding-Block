package lec6;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String ans = "";

        while(n>0){
            int rem = n%8;
            n = n/8;
            ans = rem+ans;
        }
        System.out.print(ans);
    }
}
