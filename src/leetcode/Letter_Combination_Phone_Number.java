package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Letter_Combination_Phone_Number {

    public static void main(String[] args) {
        String digits = "";
        List<String> ans = letterCombinations(digits);
        System.out.println(ans);
    }

    private static List<String> letterCombinations(String digits) {
        HashMap<Integer,String>map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqr");
        map.put(8,"stu");
        map.put(9,"vwx");

       // String[] nokia = {"abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
        List<String>list = new ArrayList<>();
        if (digits.length() == 0){
            return list;
        }
        keypad(digits,list,map,"");
        return list;
    }

    private static void keypad(String s,List<String>list,HashMap<Integer,String>nokia,String ans) {
        if (s.length() == 0){
            list.add(ans);
            return;
        }
        int digit = s.charAt(0) - '0';
        String rem = s.substring(1);
        String str = String.valueOf(nokia.get(digit));
        for (int i = 0; i < str.length(); i++) {
            keypad(rem,list,nokia,ans + str.charAt(i));
        }
    }
}
