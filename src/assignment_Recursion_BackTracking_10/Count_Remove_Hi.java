package assignment_Recursion_BackTracking_10;

import java.util.Scanner;

public class Count_Remove_Hi {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String temp = str;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i'){
                count++;
            }
        }
        System.out.println(count);
        countHi(str,"",temp);
    }

    private static void countHi(String str,String ans,String temp) {
        if (str.length() == 0){
            if (ans.length() == temp.length() - count*2 || ans.length() == temp.length() + count) {
                System.out.println(ans);
            }
            return;
        }

        char ch = str.charAt(0);
        if (ch == 'h' && str.charAt(1) == 'i'){
            countHi(str.substring(2),ans,temp);
            countHi(str.substring(2),ans+"bye",temp);

        }else {
            countHi(str.substring(1),ans+ch,temp);
        }
    }
}
