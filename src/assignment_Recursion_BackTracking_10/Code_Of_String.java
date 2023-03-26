package assignment_Recursion_BackTracking_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Code_Of_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        ArrayList<String>list = new ArrayList<>();
        codeString(s,list,"");
        System.out.println(list);
    }

    private static void codeString(String s, ArrayList<String> list,String ans) {
        if (s.length() == 0){
            list.add(ans);
            return;
        }
        int digit = s.charAt(0) - '0';
        codeString(s.substring(1),list,ans + (char)(digit - 1 + 'a'));
        if (s.length() >= 2){
            String str = s.substring(0,2);
            int digit2 = Integer.parseInt(str);
            if (digit2 <= 26) {
                codeString(s.substring(2), list, ans + (char) (digit2 - 1 + 'a'));
            }
        }

    }
}
