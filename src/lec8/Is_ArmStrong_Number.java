package lec8;

import java.util.Scanner;

public class Is_ArmStrong_Number {
    static  Scanner scanner = new Scanner(System.in);
    static String str = scanner.nextLine();
    static int str2 = Integer.parseInt(str);
    static int sum = 0;
    public static void main(String[] args) {
        int l = str.length();
        boolean ans = isArm(l);
        System.out.println(ans);
    }
    private static boolean isArm(int l) {

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i)-'0';

            int ans = (int) Math.pow(digit,l);
            sum = sum + ans;
        }

        if (str2 == sum){
            return true;
        }else{
            return false;
        }



    }
}
