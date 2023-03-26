package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations_3 {
    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        List<List<Integer>>ans = combine(n,k);
        System.out.println(ans);
    }

    private static List<List<Integer>> combine(int n, int k) {

         int[] combinations = {1,2,3,4,5,6,7,8,9};

        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        combination(combinations,ans,list,k,0,0,n);
        return ans;
    }

    private static void combination(int[] combinations,List<List<Integer>>ans,List<Integer> list, int k, int index,int l,int target) {
        if (target == 0 && l == k){
            List<Integer>m = new ArrayList<>(list);
            ans.add(m);
            return;
        }

        for (int i = index; i < combinations.length; i++) {
            list.add(combinations[i]);
            combination(combinations,ans,list,k,i + 1,l + 1,target - combinations[i]);
            list.remove(list.size() - 1);
        }
    }
}
