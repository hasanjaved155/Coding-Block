package assignment_6;

import java.util.Scanner;

public class Painter_Partition_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();//no. of painter
        int n = scanner.nextInt();//no. of board
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans = painter(arr,k,n);
        System.out.println(ans);
    }

    private static int painter(int[] arr, int k, int n) {
        int start = 0;
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        int end = sum;
        int ans = 0;

        while(start <= end){
            int mid = (start + end)/2;
            if (isPossible(mid,arr,n,k)){
                end = mid - 1;
                ans = mid;
            }else start = mid + 1;
        }
        return ans;
    }

    private static boolean isPossible(int mid, int[] arr, int n, int k) {

        int painter = 1;
        int time = 0;

        for (int i = 0; i < n;) {
            if (time + arr[i] <= mid){
                time = time + arr[i];
                i++;
            }else{
                painter++;
                time = 0;
            }
            if (painter > k)return false;
        }
        return true;
    }
}
