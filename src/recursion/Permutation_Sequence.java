package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Permutation_Sequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        String ans = permutation(n,k);
        System.out.println(ans);
    }

    private static String permutation(int n, int k) {
        HashMap<Integer,String>map = new HashMap<>();
        map.put(1,"1");
        map.put(2,"12");
        map.put(3,"123");
        map.put(4,"1234");
        map.put(5,"12345");
        map.put(6,"123456");
        map.put(7,"1234567");
        map.put(8,"12345678");
        map.put(9,"123456789");
        ArrayList<String>list = new ArrayList<>();
        String s = map.get(n);
        String temp = new String(s);

        //char[] temp2 = str.toCharArray();
//        for (int i = 0; i < temp2.length; i++) {
//            System.out.println(temp2[i]);
//        }
        char [] temp2 = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            temp2[i] = s.charAt(i);
        }
        Arrays.sort(temp2);
        s = new String(temp2);
        //System.out.println(str);


        dictionary(s, "", false, temp,list);

        return list.get(k-1);
    }

    private static void dictionary(String s, String ans, boolean flag, String temp,ArrayList<String>list) {
        if (s.length() == 0) {
            if (ans.compareTo(temp) >= 0) {
               // System.out.println(ans);
                list.add(ans);
                //System.out.println(list);
                return;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            String ros = s.substring(0, i) + s.substring(i + 1);
            char ch = s.charAt(i);
            if (flag) {
                 dictionary(ros, ans + ch, flag, temp,list);

            } else {
                if (s.charAt(i) >= s.charAt(0)) {
                    dictionary(ros, ans + ch, flag || ch > s.charAt(0), temp,list);

                } else if (s.charAt(i) < s.charAt(0)) {
                    // No call
                }
            }
        }
        //return ans1;
    }
}
