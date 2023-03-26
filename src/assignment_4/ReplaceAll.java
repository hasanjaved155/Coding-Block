package assignment_4;

import java.util.Scanner;

public class ReplaceAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i)-'0';
            if (digit==0){
                System.out.print(5);
            }else{
                System.out.print(digit);
            }
        }
    }
}