package leetcode;

import java.util.*;

public class Large_Group_Position {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<List<Integer>> list = largeGroupPosition(s);
        System.out.println(list);
    }

    private static List<List<Integer>> largeGroupPosition(String s) {
        List<List<Integer>>list = new ArrayList<>();
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            if (j == s.length() - 1 || s.charAt(j) != s.charAt(j + 1)){
                if (j - i + 1 >= 3){
                    List<Integer>l = new ArrayList<>();
                    l.add(i);
                    l.add(j);
                    list.add(l);
                }
                i = j + 1;
            }
        }
        return list;
    }
}