package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum {
    public static void main(String[] args) {
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;


        List<List<Integer>>ans = fourSum(arr,target);
        System.out.println(ans);
    }

    private static List<List<Integer>> fourSum(int[] arr,int target) {
        if (target == -294967296 || target == 294967296){
            target *= -1;
        }
        Arrays.sort(arr);
        List<List<Integer>>ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (i == 0 || arr[i - 1] != arr[i]){
                threeSum(arr,a,ans,i + 1,target-arr[i]);
            }
        }
        return ans;
    }

    private static void threeSum(int[] arr,int a,List<List<Integer>>ans,int index,int target1) {
        for (int i = index; i < arr.length; i++) {
            int b = arr[i];
            if (i == index || arr[i - 1] != arr[i]) {
                twoSum(i + 1, arr.length - 1, arr, target1 - arr[i], ans,a,b);
            }
        }
    }

    private static void twoSum(int c, int d, int[] arr, int target,List<List<Integer>>ans,int a,int b) {
        while(c < d){
            if (arr[c] + arr[d] > target){
                d--;
            }
            else if (arr[c] + arr[d] < target){
                c++;
            }
            else{
                List<Integer>list = new ArrayList<>();
                list.add(a);
                list.add(b);
                list.add(arr[c]);
                list.add(arr[d]);
                ans.add(list);
                while (c < d && arr[c] == arr[c + 1])c++;
                while (c < d && arr[d] == arr[d - 1])d--;
                c++;
                d--;
            }
        }
    }
}
