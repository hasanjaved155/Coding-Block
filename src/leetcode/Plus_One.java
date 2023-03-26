package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Plus_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =  scanner.nextInt();
        }

        int [] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] plusOne(int[] arr) {
        int [] ans = new int[arr.length + 1];
        int k = ans.length - 1;
        int i = arr.length - 1;
        int j = 1;
        int carry = 0;
        while(i >= 0){
            int sum = arr[i] + j + carry;
            int r = sum % 10;
            //System.out.println(r);
            ans[k] = r;
            //System.out.println(ans[k]);
            carry = sum / 10;

            i--;
            k--;
            j = 0;
        }
        if (carry == 0){
            int m = 0;
            int [] ans2 = new int[arr.length];
            while(m < arr.length){
                ans2[m] = ans[m + 1];
                m++;
            }
            return ans2;
        }
        ans[0] = carry;
        return ans;
    }
}
