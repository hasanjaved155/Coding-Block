package assignment_5;

import java.util.Arrays;
import java.util.Scanner;

public class Calculate_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        rotate(arr,x);
    }

    private static void rotate(int[] nums, int x) {
        //x = x%nums.length;

        for (int i = x-1; i >= 0 ; i--) {
            int [] temp = new int[nums.length];
            for (int j = 0; j < nums.length; j++) {
                temp[j] = nums[j];
            }

            reverseArray(0 ,  nums.length-1 ,  nums);
            reverseArray(0 ,  i-1 ,  nums);
            reverseArray(i,  nums.length-1 ,  nums);

            int [] sum = new int[nums.length];
            for (int j = 0; j < nums.length; j++) {
                sum[j] = nums[j] + temp[j];
            }

            for (int j = 0; j < nums.length; j++) {
                nums[j] = sum[j];
            }
//            System.out.println(Arrays.toString(temp));
//            System.out.println(Arrays.toString(sum));
//            System.out.println(Arrays.toString(nums));
        }
        int sum_2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum_2 = sum_2 + nums[i];
        }
        System.out.println(sum_2);
    }

    public static void  reverseArray(int i , int j , int[] arr){

        while(i<j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;

        }
    }
}
