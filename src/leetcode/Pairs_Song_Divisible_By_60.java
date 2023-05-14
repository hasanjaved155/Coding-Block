package leetcode;

import java.util.Arrays;

public class Pairs_Song_Divisible_By_60 {
    public static void main(String[] args) {
        int[] time = {60,60,60};
        System.out.println(numPairsDivisibleBy60(time));
    }

    private static int numPairsDivisibleBy60(int[] time) {
        int[] arr = new int[60];
        for (int i = 0; i < time.length; i++) {
            time[i] = time[i] % 60;
        }
        int ans = 0;
        for (int i = 0; i < time.length; i++) {
            int num = time[i];
            if (num != 0){
                num = 60 - num;
            }
            ans = ans + arr[num];
            arr[time[i]]++;
        }

        return ans;
    }
}