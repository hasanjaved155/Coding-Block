package assignment_Recursion_BackTracking_10;

import java.util.Scanner;

public class Split_Array {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        splitArray(arr,0,"","",0,0);
        System.out.println(count);
    }

    private static void splitArray(int[] arr, int index, String ans1, String ans2, int sum1, int sum2) {
        if (index == arr.length){
            if (sum1 == sum2){
                System.out.println(ans1 + "and " +  ans2);
                count++;
            }
            return;
        }
        splitArray(arr,index + 1,ans1 + arr[index] + " ",ans2,sum1 + arr[index],sum2);
        splitArray(arr,index + 1,ans1,ans2 + arr[index] + " ",sum1,sum2 + arr[index]);
    }
}
