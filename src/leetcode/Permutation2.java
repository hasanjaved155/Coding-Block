package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation2 {
    public static void main(String[] args) {
        int[] candidates = {3,3,0,3};

        List<List<Integer>> ans = permute(candidates);
        System.out.println(ans);


    }

    private static List<List<Integer>> permute(int[] candidates) {
        Arrays.sort(candidates);
        int[] visited = new int[candidates.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        check(candidates, ans, list, 0,visited);
        return ans;
    }

    private static void check(int[] candidates,List<List<Integer>> ans, List<Integer> list, int index,int[] visited) {
        if (index == candidates.length) {
            List<Integer> l = new ArrayList<>(list);
            ans.add(l);
            return;
        }
        for (int i = 0; i < candidates.length; i++) {
            if(i != 0 && visited[i-1] == 0 && candidates[i] == candidates[i-1]) continue;
            if (visited[i] == 0) {
                visited[i] = 1;
                list.add(candidates[i]);
                check(candidates, ans, list, index + 1, visited);
                list.remove(list.size() - 1);
                visited[i] = 0;
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

