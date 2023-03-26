package assignment_8;

import java.util.Scanner;

public class Playing_With_Good_String_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        good(str);
    }
    public static void good(String str) {

        String s1="";
        for (int len = 1; len <= str.length(); len++) {
            for (int j = len; j <= str.length() ; j++) {
                int i = j - len;
                String s = str.substring(i,j);
                if(isvowel(s)) {
                    s1= s;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(s1.length());
    }
    public static boolean isvowel(String str1) {
        for(int i=0;i<str1.length();i++) {
            if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u') {
                return true;
            }
        }
        return false;
    }
}
