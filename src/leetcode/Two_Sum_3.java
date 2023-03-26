package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Sum_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();

        int [] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] twoSum(int[] arr,int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int k = 2;
        int [] ans = new int[k];
        while(i < j){
            if (arr[i] + arr[j] > target){
                j--;
            }
            else if (arr[i] + arr[j] < target){
                i++;
            }
            else{
                ans[0] = i;
                ans[1] = j;
                break;
            }
        }
        return ans;
    }
}
