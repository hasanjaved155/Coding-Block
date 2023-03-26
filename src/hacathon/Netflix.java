package hacathon;

import java.util.Arrays;
import java.util.Scanner;

public class Netflix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int len = scanner.nextInt();

        int ans = netflix(arr,n,len);
        System.out.println(ans);
    }

    private static int netflix(int[] arr, int n,int len) {
        int start = 0;
        int max_1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max_1)max_1 = arr[i];
        }
        int end = max_1;
        int ans = 0;
        while(start <= end){
            int mid = (start + end)/2;
            if (isPossible(mid,arr,len,n)){
                ans = mid;
                start = mid + 1;
            }else end = mid - 1;
        }
        return ans;
    }

    private static boolean isPossible(int mid, int[] arr, int len, int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (mid < arr[i]) ans = ans + arr[i] - mid;
            if (ans >= len)return true;
        }
        return false;
    }
}
