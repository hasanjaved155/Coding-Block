package lec31;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {7,5,1,4,2};
        int[] ans = merge_Sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] merge_Sort(int[] arr,int start,int end) {
        if (start == end){
            int[] ans = new int[1];
            ans[0] = arr[start];
            return ans;
        }
        int mid = (start + end)/2;
        int[] arr1 = merge_Sort(arr,start,mid);
        int[] arr2 = merge_Sort(arr,mid + 1,end);

        return merge(arr1,arr2);
    }

    private static int[] merge(int[] arr1, int[] arr2) {
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
