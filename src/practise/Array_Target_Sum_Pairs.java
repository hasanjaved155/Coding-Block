package practise;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Target_Sum_Pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();

        twoSum(0,arr.length - 1,arr,target);
    }

    private static void twoSum(int b, int c,int[] arr,int target) {
        Arrays.sort(arr);
        while(b < c){
            if (arr[b] + arr[c] > target){
                c--;
            }
            else if (arr[b] + arr[c] < target){
                b++;
            }
            else{
                System.out.println(arr[b]+" and "+arr[c]);
                b++;
                c--;
            }
        }
    }
}