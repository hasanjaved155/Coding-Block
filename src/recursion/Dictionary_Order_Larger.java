package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Dictionary_Order_Larger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String temp = new String(str);

        //char[] temp2 = str.toCharArray();
//        for (int i = 0; i < temp2.length; i++) {
//            System.out.println(temp2[i]);
//        }
        char [] temp2 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            temp2[i] = str.charAt(i);
        }
        Arrays.sort(temp2);
        str = new String(temp2);
        //System.out.println(str);

        dictionary(str, "", false, temp);
    }

    private static void dictionary(String s, String ans,boolean flag, String temp) {

        if (s.length() == 0) {
            if (ans.compareTo(temp) > 0) {
                System.out.println(ans);
            }
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String ros = s.substring(0, i) + s.substring(i + 1);
            char ch = s.charAt(i);
            if (flag) {
                dictionary(ros, ans + ch, flag, temp);
            } else {
                if (s.charAt(i) >= s.charAt(0)) {
                    dictionary(ros, ans + ch, flag || ch > s.charAt(0), temp);
                } else if (s.charAt(i) < s.charAt(0)) {
                    // No call
                }
            }
        }
    }
}