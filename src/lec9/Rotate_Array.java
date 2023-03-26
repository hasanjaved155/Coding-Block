package lec9;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);
    }

    private static void rotate(int[] nums, int k) {
        k = k%nums.length;

        reverseArray(0 ,  nums.length-1 ,  nums);
        reverseArray(0 ,  k-1 ,  nums);
        reverseArray(k,  nums.length-1 ,  nums);

        System.out.print(Arrays.toString(nums));

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
