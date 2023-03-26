package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 5};
        int target = 8;

        List<List<Integer>> ans = combinationSum(candidates, target);
        System.out.println(ans);


    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        sum(candidates, target, ans, list, 0);
        return ans;
    }

    private static void sum(int[] candidates, int target, List<List<Integer>> ans, List<Integer> list, int index) {
        if (target == 0) {
            List<Integer> l = new ArrayList<>(list);
            ans.add(l);
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (target >= candidates[i]) {
                list.add(candidates[i]);
                sum(candidates, target - candidates[i], ans, list, i);
                list.remove(list.size() - 1);
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

