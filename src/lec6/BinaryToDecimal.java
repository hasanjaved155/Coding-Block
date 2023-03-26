package lec6;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < n; j++) {
            String s = scanner.nextLine();

            int sum = 0;
            int base = 1;
            for (int i = s.length()-1; i >=0 ; i--) {
                int digit = s.charAt(i)-'0';
                int ans = (int) (digit*base);
                sum = sum+ans;

                base = base*2;
            }
            System.out.println(sum);
        }

    }
}
