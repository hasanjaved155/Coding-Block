package practise;

import java.util.Scanner;

public class Print_ArmStrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

         armStrong(n1,n2);
    }

    private static void armStrong(int n1, int n2) {

        for (int i = n1 + 1; i < n2 ; i++) {
            String s = String.valueOf(i);
            int j = 0;
            int sum = 0;
            while (j < s.length()){
                int digit = s.charAt(j) - '0';
                sum = (int) (sum + Math.pow(digit,s.length()));
                j++;
            }
            if (sum == i){
                System.out.println(i);
            }
        }
    }
}
