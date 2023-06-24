package lec53;

import java.util.ArrayList;
import java.util.Arrays;

public class Counting_Sort {
    public static void main(String[] args) {
        int[] arr = {2,1,1,0,1,2,5,4,0,2,8,7,9,2,6,1,9};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int[] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 1; i < freq.length; i++) {
             freq[i] = freq[i - 1] + freq[i];
        }
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[freq[arr[i]] - 1] = arr[i];
            freq[arr[i]]--;
        }
        return arr2;
    }
}
