package assignment_Recursion_BackTracking_10;

import java.util.Arrays;
import java.util.Scanner;

public class Dictionary_Order_Larger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String temp = new String(s);
        char[] temp2 = new char[s.length()];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = s.charAt(i);
        }
        Arrays.sort(temp2);
        s = new String(temp2);
        //System.out.println(temp2);
        //System.out.println(s);
        dictionary(temp,s,"");
    }

    private static void dictionary(String temp, String str, String ans) {
        if (str.length() == 0){
            if (ans.compareTo(temp) > 0) {
                System.out.println(ans);
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean flag = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                dictionary(temp, rem, ans + ch);
            }
        }
    }
}
