package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Find_Pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        System.out.println(findPairs(arr,k));
    }

    private static int findPairs(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        int count = 0;
        while(j < arr.length){
            if (arr[j] - arr[i] < k){
                j++;
            } else if ((arr[j] - arr[i]) == k) {
                count++;
                i++;
                j++;
            } else if (arr[j] - arr[i] > k){
               i++;
            }
        }
        return count;
    }
}
