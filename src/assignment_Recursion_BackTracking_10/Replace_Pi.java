package assignment_Recursion_BackTracking_10;

import java.util.Scanner;

public class Replace_Pi {
    static String ans = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            String str = scanner.nextLine();
            replacePi(str,0);
            System.out.println(ans);
            ans = "";
        }
    }

    private static void replacePi(String str, int index) {
        if (index >= str.length())return;
        if (index == str.length() - 1){
            ans += str.charAt(str.length() - 1);
            return;
        }

        if (str.charAt(index) == 'p' && str.charAt(index + 1) == 'i'){
            //System.out.println(ans);
            ans += "3.14";
            replacePi(str,index + 2);
        }else{
            ans += str.charAt(index);
            //System.out.println(ans);
            replacePi(str,index + 1);
        }
    }
}
