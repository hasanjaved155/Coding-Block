package leetcode_contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class One_D_Array_to_2D_Array {
    public static void main(String[] args) {
        int[] arr = {1,3,4,1,2,3,1};

        List<List<Integer>>ans = findMatrix(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> findMatrix(int[] arr) {
        List<List<Integer>>ans = new ArrayList<>();
        convert(arr,ans);
        return ans;
    }

    private static void convert(int[] arr, List<List<Integer>> ans) {
        int max = 0;
        int[] farr = new int[201];
        for (int i = 0; i < arr.length; i++) {
             farr[arr[i]]++;
             max = Math.max(farr[arr[i]],max);
        }
        for (int i = 0; i < max; i++) {
            List<Integer>list = new ArrayList<>();
            ans.add(list);
        }
        for (int i = 0; i < farr.length; i++) {
            if (farr[i] == 0)continue;
            int j = 0;
            for (int k = 0; k < farr[i]; k++) {
                ans.get(j).add(i);
                j++;
            }
        }
    }
}
