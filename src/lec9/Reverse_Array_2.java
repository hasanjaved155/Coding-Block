package lec9;

import java.util.Arrays;

public class Reverse_Array_2 {
    public static void main(String[] args) {
        int [] arr = {2,1,3,4,7};
        revese(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Two pointer approach


    private static void revese(int[] arr) {
        for (int j = 0; j < arr.length/2; j++) {
            int temp = arr[j];
            arr[j] = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = temp;
        }
    }
}
