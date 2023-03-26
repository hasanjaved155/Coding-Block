package assignment_4;

import java.util.Scanner;

public class Odd_Evev_Delhi {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {
            int sum1 = 0;
            int sum2=0;
            String s = scanner.nextLine();
            for (int j = 0; j < s.length(); j++) {

                int digit = s.charAt(j) - 0;
                if (digit%2!=0){
                    sum1 = sum1 + digit;
                }else{
                    sum2 = sum2 + digit;
                }
            }
            if (sum1%3==0 || sum2%4==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}

