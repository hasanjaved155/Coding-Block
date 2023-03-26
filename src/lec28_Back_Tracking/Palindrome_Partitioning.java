package lec28_Back_Tracking;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String s = "nitin";
        List<List<String>>ans = partition(s);
        System.out.println(ans);
    }

    private static List<List<String>> partition(String s) {
        List<List<String>>list = new ArrayList<>();
        List<String>pal = new ArrayList<>();
        palindrome_Partition(s,pal,list);
        return list;
    }

    private static void palindrome_Partition(String s, List<String> pal, List<List<String>> list) {
        if (s.length() == 0){
             List<String>l = new ArrayList<>(pal);
             list.add(l);
            return;
        }

        for (int i = 1; i <= s.length(); i++) {
            String str = s.substring(0,i);
            if (isPalindrome(str)){
                pal.add(str);
                palindrome_Partition(s.substring(i),pal,list);
                pal.remove(pal.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
