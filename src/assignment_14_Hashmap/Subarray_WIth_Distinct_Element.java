package assignment_14_Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Subarray_WIth_Distinct_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(subarray(arr));
    }

    private static int subarray(int[] arr) {
        HashSet<Integer>map = new HashSet<>();
        int j = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            while(j < arr.length && !map.contains(arr[j])){
                map.add(arr[j]);
                j++;
            }
            count += ((j - i) * (j - i + 1)) / 2;
            map.remove(arr[i]);
        }
        return count;
    }
}
