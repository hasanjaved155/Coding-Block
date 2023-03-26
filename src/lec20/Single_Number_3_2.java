package lec20;

import java.util.Scanner;

public class Single_Number_3_2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int [] ar = {-1,0};


        int [] ans = single_Number_3(ar);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] single_Number_3(int[] nums) {

        int n = 100000;
       // int s = Integer.MIN_VALUE;
        int arr[] = new int[n];



        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            arr[k]++;
        }
        int x = 0;
        for (int i = 0; i < n; i++) {

            if(arr[i]==1){
                // System.out.print(i+" ");
                x++;
            }

        }
        int l = 0;
        int [] ans = new int[x];
        for (int i = 0; i < n; i++) {

            if(arr[i]==1){
               // System.out.print(i+" ");
                ans[l] = i;
                l++;
            }

        }
        return ans;
    }
}
