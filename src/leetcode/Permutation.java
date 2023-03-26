package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] candidates = {1, 2, 3};

        List<List<Integer>> ans = permute(candidates);
        System.out.println(ans);


    }

    private static List<List<Integer>> permute(int[] candidates) {
        HashMap<Integer,Integer>map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        check(candidates, ans, list, 0,map);
        return ans;
    }

    private static void check(int[] candidates,List<List<Integer>> ans, List<Integer> list, int index,HashMap<Integer,Integer>map) {
        if (index == candidates.length) {
            List<Integer> l = new ArrayList<>(list);
            ans.add(l);
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
                list.add(candidates[i]);
                check(candidates, ans, list, index + 1, map);
                list.remove(list.size() - 1);
                map.remove(i,1);
            }
        }
    }
}

//    private static void sum(int[] candidates, int target,String ans) {
//        if (target < 0)return;
//        if (target == 0){
//            System.out.print(ans+" ");
//            return;
//        }
//
//        for (int i = 0; i < candidates.length; i++) {
//            combinationSum(candidates,target - candidates[i],ans+candidates[i]+" ");
//        }
//    }

