package leetcode_contest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Even_Odd_Bits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ans = evenOddBit(n);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] evenOddBit(int n) {
        int[] arr = new int[2];
        int ans = 0;
        int temp2 = n;
        while(temp2 > 0){
            int r = temp2 % 2;
             ans++;
            temp2 = temp2 / 2;
        }
        int[] arr2 = new int[ans];
        int j = 0;

        while(n > 0){
            int r = n % 2;
            arr2[j] = r;
            ans++;
            n = n / 2;
            j++;
        }
        int l = 1;
        int m = 1;
        for (int k = 0; k < arr2.length; k++) {
            if (k % 2 == 0 && arr2[k] == 1){
                arr[0] = l;
                l++;
            } else if (k % 2 != 0 && arr2[k] == 1) {
                arr[1] = m;
                m++;
            }
        }
        return arr;
    }
}
