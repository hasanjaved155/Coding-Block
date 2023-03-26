package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascal_s_Triangle_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer>list = getRow(n);
        System.out.println(list);
    }
    private static List<Integer> getRow(int n) {
        List<Integer> ans = new ArrayList<>();
        long val = 1;
        int r = 0;
        while(r <= n){
            ans.add((int) val);
            val = (val * (n - r)) / (r + 1);
            r++;
        }
        return ans;
    }
}
