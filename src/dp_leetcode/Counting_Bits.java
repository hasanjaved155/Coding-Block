package dp_leetcode;

import java.util.Arrays;

public class Counting_Bits {
    public static void main(String[] args) {
        int n = 5;
        int[] ans = countBits(n);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int x = count(i);
            ans[i] = x;
        }
        return ans;
    }

    private static int count(int item) {
        if (item == 0 || item == 1)return item;
        int x = 0;
        while(item >> 1 != 0){
            int rem = item % 2;
            if (rem == 1){
                x++;
            }
            item = item >> 1;
            if (item == 1){
                x++;
            }
        }
        return x;
    }
}
