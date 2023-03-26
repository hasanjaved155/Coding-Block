package lec15;

import java.util.Scanner;

public class String_1 {
    public static void main(String[] args) {
//        String s = "hello";
//        String s1 = new String("hello");
//        String s2 = "hello";
//        String s3 = new String("hello");
//        String s4 = s3;
//        System.out.println(s1);
//        System.out.println(s4);
//        System.out.println(s == s1);
//        System.out.println(s2 == s3);
//        System.out.println(s1 == s3);
//        System.out.println(s == s2);
//        System.out.println(s.charAt(2));
//        System.out.println(s.length());
        String s1 = "hello";
        //String s2 = "abcde";
        String s2 = "hello";
        System.out.println(s1.equals(s2));
        boolean ans = Equals(s1,s2);
        System.out.println(ans);
    }

    private static boolean Equals(String s1, String s2) {
        if (s1 == s2)return true;
        if (s1.length()!=s2.length())return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)!=s2.charAt(i))return false;
        }
        return true;
    }
}
