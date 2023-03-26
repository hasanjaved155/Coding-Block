package hacathon_2;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array_Set_Bits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int [] ans = sortArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print((ans[i]) + " ");
        }
    }

    private static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = setCount(arr[i]);
            int ans = 100000 * count;
            arr[i] = arr[i] + ans;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 100000;
        }
        return arr;
    }

    private static int setCount(int n) {
        int bit = 0;
        while(n > 0){
            n = (n & (n - 1));
            bit++;
        }
        return bit;
    }
}
