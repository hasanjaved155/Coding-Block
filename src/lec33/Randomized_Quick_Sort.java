package lec33;

import java.util.Arrays;
import java.util.Random;

public class Randomized_Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {5,7,2,3,8,1,4};
        quick_Sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quick_Sort(int[] arr, int start, int end) {
        if (start >= end){
            return;
        }
        int index = check(arr,start,end);
        quick_Sort(arr,start,index - 1);
        quick_Sort(arr,index + 1,end);
    }

    private static int check(int[] arr,int start, int end) {
        random(arr,start,end);

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

    private static void random(int[] arr, int start, int end) {
        Random r = new Random();
        int x = r.nextInt(end - start + 1) + start;
        System.out.print(x + " ");
        int temp = arr[end];
        arr[end] = arr[x];
        arr[x] = temp;
    }
}
