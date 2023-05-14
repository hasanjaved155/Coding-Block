package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Larger_Group_Position_2 {
    public static void main(String[] args) {
        String s = "abbba";
        List<List<Integer>>ans = position(s);
        System.out.println(ans);
    }

    private static List<List<Integer>> position(String s) {
        List<List<Integer>>ans = new ArrayList<>();
        int count = 1;
        int x = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)){
                count++;
                x = i;
            } else if (s.charAt(i) != s.charAt(i + 1)) {
                if (count >= 3){
                    List<Integer>list = new ArrayList<>();
                    list.add(i - count + 1);
                    list.add(i);
                    ans.add(list);
                }
                count = 1;
            }
        }
        if (count >= 3){
            List<Integer>list = new ArrayList<>();
            list.add(x + 1 - count + 1);
            list.add(x + 1);
            ans.add(list);
        }
        return ans;
    }
}
