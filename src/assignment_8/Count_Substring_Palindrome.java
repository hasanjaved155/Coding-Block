package assignment_8;

import java.util.Scanner;

public class Count_Substring_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        subString_Palindrome(s);
    }

    private static void subString_Palindrome(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length()+1; j++) {
                //System.out.println(s.substring(i,j));
                String s1 = s.substring(i,j);
                if (palindrome(s1)){
                    //System.out.println(s1);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean palindrome(String s1) {

        int i = 0;
        int j = s1.length()-1;

        while(i < j){
            if (s1.charAt(i)==s1.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return  true;
    }
}
