package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascal_s_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>>list = generate(n);
        System.out.println(list);
    }
    private static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int row = 0;
        int col = 0;
        while(row < n){
            int val = 1;
            int r = 0;
            List<Integer>ans2 = new ArrayList<>();
            while(r <= col){
                ans2.add(val);
                val = (val * (row - r)) / (r + 1);
                r++;
            }
            ans.add(ans2);
            row++;
            col++;
        }
        return ans;
    }
}
