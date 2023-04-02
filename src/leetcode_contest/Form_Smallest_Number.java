package leetcode_contest;

import java.util.Arrays;
import java.util.Scanner;

public class Form_Smallest_Number {
    public static void main(String[] args) {
        int[] arr1 = {7,5,6};
        int[] arr2 = {1,4};
        System.out.println(minNumber(arr1,arr2));
    }

    private static int minNumber(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        String ans = "";
        String ans2 = "";
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                ans = ans + arr1[i];
                return Integer.parseInt(ans);
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        ans = ans + arr1[0] + ans + arr2[0];
        ans2 = ans2 + arr2[0] + ans2 + arr1[0];
        if (Integer.parseInt(ans) < Integer.parseInt(ans2)) {
            return Integer.parseInt(ans);
        }
        return Integer.parseInt(ans2);
    }
}
