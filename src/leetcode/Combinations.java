package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<List<Integer>>ans = combine(n,k);
        System.out.println(ans);
    }

    private static List<List<Integer>> combine(int n, int k) {

        int[] combinations = new int[n];
        for (int i = 0; i < n; i++) {
            combinations[i] = i + 1;
        }

        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        combination(combinations,ans,list,k,0,0);
        return ans;
    }

    private static void combination(int[] combinations,List<List<Integer>>ans,List<Integer> list, int k, int index,int l) {
        if (l == k){
            List<Integer>m = new ArrayList<>(list);
            ans.add(m);
            return;
        }

        for (int i = index; i < combinations.length; i++) {
            list.add(combinations[i]);
            combination(combinations,ans,list,k,i + 1,l + 1);
            list.remove(list.size() - 1);
        }
    }
}
