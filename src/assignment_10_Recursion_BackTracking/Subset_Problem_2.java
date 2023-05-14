package assignment_10_Recursion_BackTracking;

import java.util.Scanner;

public class Subset_Problem_2 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        subset_Problem(arr,target,0,"",0);
        System.out.println("\n"+count);
    }

    private static void subset_Problem(int[] arr, int target,int index,String ans,int sum) {
         if (index == arr.length){
             if (sum == target) {
                 System.out.print(ans + " ");
                 count++;
             }
             return;
         }
         subset_Problem(arr,target,index + 1,ans + arr[index] + " ",sum + arr[index]);
         subset_Problem(arr,target,index + 1,ans,sum);
    }
}
