package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
    public static void main(String[] args) {
        int[] arr = {0,1,1};

        List<List<Integer>>ans = threeSum(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (i == 0 || arr[i - 1] != arr[i]) {
                twoSum(i + 1, arr.length - 1, arr, 0 - arr[i], ans,a);
            }
        }
        return ans;
    }

    private static void twoSum(int b, int c, int[] arr, int target,List<List<Integer>>ans,int a) {
        while(b < c){
            if (arr[b] + arr[c] > target){
                c--;
            }
            else if (arr[b] + arr[c] < target){
                b++;
            }
            else{
                List<Integer>list = new ArrayList<>();
                list.add(a);
                list.add(arr[b]);
                list.add(arr[c]);
                ans.add(list);
                while (b < c && arr[b] == arr[b + 1])b++;
                while (b < c && arr[c] == arr[c - 1])c--;
                b++;
                c--;
            }
        }
    }
}
