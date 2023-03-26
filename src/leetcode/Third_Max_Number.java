package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Third_Max_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(thirdMax(arr));
    }

    private static int thirdMax(int[] arr) {
        if (arr.length == 1){
            return arr[0];
        }
        if (arr.length == 2){
            int ans = Math.max(arr[0],arr[1]);
            return ans;
        }
        long m1 = Long.MIN_VALUE;
        long m2 = Long.MIN_VALUE;
        long m3 = Long.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (m1 == arr[i] || m2 == arr[i] || m3 == arr[i]) {
                continue;
            }
            if (arr[i] > m1){
                m3 = m2;
                m2 = m1;
                m1 = arr[i];
            } else if (arr[i] > m2) {
                m3 = m2;
                m2 = arr[i];
            } else if (arr[i] > m3){
                m3 = arr[i];
            }
        }

        if (m3 == Long.MIN_VALUE){
            //System.out.println(m1);
            return (int) m1;
        }
        return (int) m3;
    }
}
