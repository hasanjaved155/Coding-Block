package assignment_Revesion;

import java.util.Scanner;

public class Sum_Odd_Even_Places {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

         odd_Even(n);
    }

    private static void odd_Even(int n) {
        String ans = "";
        while(n > 0){
            int r = n % 10;
            ans = ans + r;
            n = n / 10;
        }
        int num = 0;
        int num2 = 0;
        for (int i = 0; i < ans.length(); i++) {
            int digit = ans.charAt(i)-'0';
            if ((i + 1) % 2 != 0){
                num = num + digit;
            }else{
                num2 = num2+ digit;
            }
        }
        System.out.println(num);
        System.out.println(num2);
    }
}
