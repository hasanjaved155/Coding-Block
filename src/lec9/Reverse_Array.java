package lec9;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int [] arr = {2,1,3,4,7};
        revesr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void revesr(int[] arr) {

        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
