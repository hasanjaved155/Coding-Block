package leetcode;

import java.util.*;

public class Combinations_Sum_2 {
    public static void main(String[] args) {
        int[] candidates = {14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12};
        int target = 27;

        List<List<Integer>> ans = combinationSum(candidates, target);
        System.out.println(ans);

    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
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
            if(i!=index && candidates[i]==candidates[i-1]) continue;
            if (target >= candidates[i]) {
                list.add(candidates[i]);
                sum(candidates, target - candidates[i], ans, list, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
