package assignment_Recursion_BackTracking_10;

import java.util.Scanner;

public class Count_Replace_Hi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i'){
                count++;
            }
        }
        System.out.println(count);
        remove_hi(str,"");
        replace_hi(str,"");
    }


    private static void remove_hi(String str, String ans) {
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }

        if (str.length() >= 2 && str.charAt(0) == 'h' && str.charAt(1) == 'i'){
            remove_hi(str.substring(2),ans);
        }else {
            remove_hi(str.substring(1), ans + str.charAt(0));
        }
    }
    private static void replace_hi(String str, String ans) {
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }

        if (str.length() > 2 && str.charAt(0) == 'h' && str.charAt(1) == 'i'){
            replace_hi(str.substring(2),ans + "bye");
        }else {
            replace_hi(str.substring(1), ans + str.charAt(0));
        }
    }

}
