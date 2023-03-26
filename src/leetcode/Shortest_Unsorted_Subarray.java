package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Shortest_Unsorted_Subarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findUnsortedSubarray(arr));
    }

    private static int findUnsortedSubarray(int[] arr) {
        int n = arr.length;
        int [] temp = new int[n];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        int start = temp.length;
        int end = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != temp[i]){
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
        }
        if (end - start >= 0)return end - start + 1;
        else return 0;
    }
}
