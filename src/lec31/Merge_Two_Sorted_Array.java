package lec31;

import java.util.Arrays;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int[] arr1 = {3,5,11,14,16};
        int[] arr2 = {2,3,5,7,11,13,18,19};
        int[] ans = merge_Array(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] merge_Array(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length){

            if (arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            }else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(j < arr2.length){
            arr[k] = arr2[j];
            k++;
            j++;
        }
        while(i < arr1.length){
            arr[k] = arr1[i];
            k++;
            i++;
        }
        return arr;
    }
}
