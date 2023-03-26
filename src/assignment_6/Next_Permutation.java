package assignment_6;

import java.util.Arrays;
import java.util.Scanner;

public class Next_Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int [] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            nextPermutation(arr,n);
            System.out.println();
        }
    }

    private static void nextPermutation(int[] arr, int n) {
        if (arr.length == 0 || arr == null)return;
        // find k
        int k = n-2;
        for (int i = n - 1; i > 0 ; i--) {
            if (arr[i] <= arr[i - 1]) k--;
            else break;
        }
        // if k == -1 then reverse the array
        if (k == -1) {
            reverse(arr,0,n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            return;
        }

        // else swap arr[k] with next greater array
        for (int i = n - 1; i > k; i--) {
            if (arr[i] > arr[k]){
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        // descending order then reverse it
        reverse(arr,k+1,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }
}
