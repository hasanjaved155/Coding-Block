package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Target_Sum_Triplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();

        triplet_Sum(arr,target);
    }

    private static void triplet_Sum(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
//            if (i == 0 || arr[i - 1] != arr[i]) {
//                twoSum(i + 1, arr.length - 1, arr, target - arr[i],a);
//            }
            twoSum(i + 1, arr.length - 1, arr, target - arr[i],a);
        }
    }

    private static void twoSum(int b, int c,int[] arr,int rem,int a) {

        while(b < c){
            if (arr[b] + arr[c] > rem){
                c--;
            }
            else if (arr[b] + arr[c] < rem){
                b++;
            }
            else{
                System.out.println(a+", "+arr[b]+" and "+arr[c]);
                b++;
                c--;
            }
        }
    }
}
