package assignment_6;

import java.util.Scanner;

public class Book_Allocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();//no.of books
            int m = scanner.nextInt();//no.of students
            int [] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            int ans = bookAllocation(arr,n,m);
            System.out.println(ans);
        }
    }

    private static int bookAllocation(int[] arr, int n, int m) {
        int start = 0;
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        int end = sum;
        int ans = 0;

        while(start <= end){
            int mid = (start + end)/2;
            if (isPossible(mid,arr,n,m)){
                end = mid - 1;
                ans = mid;
            }else start = mid + 1;
        }
        return ans;
    }

    private static boolean isPossible(int mid, int[] arr, int n, int m) {

        int student = 1;
        int page = 0;

        for (int i = 0; i < n; i++) {
            if (page + arr[i] <= mid){
                page = page + arr[i];
            }else{
                student++;
                if (student > m || arr[i] > mid){
                    return false;
                }
                page = arr[i];
            }
        }
        return true;
    }
}
