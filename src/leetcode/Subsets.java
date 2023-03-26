package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
         int[] combinations = {1,2,3};
        List<List<Integer>>ans = combine(combinations);
        System.out.println(ans);
    }

    private static List<List<Integer>> combine(int[] combinations) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        ans.add(list);
        combination(combinations,ans,list,0);
        return ans;
    }

    private static void combination(int[] combinations,List<List<Integer>>ans,List<Integer> list,int index) {
        if (index == combinations.length){
            return;
        }
        for (int i = index; i < combinations.length; i++) {
            list.add(combinations[i]);
            List<Integer>m = new ArrayList<>(list);
            ans.add(m);
            combination(combinations,ans,list,i + 1);
            list.remove(list.size() - 1);
        }
    }
}
