package lec31;

import java.util.Arrays;

public class Array_Partition_Check {
    // way to quick sort
    public static void main(String[] args) {
        int[] arr = {5,7,2,3,8,1,4};
        int ans = check(arr,0,arr.length - 1);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }

    private static int check(int[] arr,int start, int end) {

        int item = arr[end];
        int index = start;
        for (int i = start; i < end ; i++) {
            if (arr[i] <= item){
                //swap(arr[index],arr[i]);
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
        //swap(arr[end],arr[index]);
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;
        return index;
    }
}
