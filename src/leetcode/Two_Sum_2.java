package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Sum_2 {
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
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == target - arr[j]){
                    int k = 2;
                    int [] ans = new int[k];
                    ans[0] = i+1;
                    ans[1] = j+1;
                    return ans;
                }
            }
        }
        return null;
    }
}
