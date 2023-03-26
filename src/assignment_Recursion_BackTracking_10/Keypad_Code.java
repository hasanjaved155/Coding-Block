package assignment_Recursion_BackTracking_10;

import java.util.Scanner;

public class Keypad_Code {
    static String[] nokia = {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("\n"+keypad(s,""));
    }

    private static int keypad(String s, String ans) {
        if (s.length() == 0){
            System.out.print(ans + " ");
            return 1;
        }
        int digit = s.charAt(0) - '0';
        String rem = s.substring(1);
        String str = nokia[digit];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
           count = count + keypad(rem,ans + str.charAt(i));
        }
        return count;
    }
}
