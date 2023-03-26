package lec16;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean ans = palindrome(s);
        System.out.println(ans);
    }

    private static boolean palindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i < j){
            if (s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return  true;
    }
}
