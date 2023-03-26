package assignment_9;

import java.util.HashMap;
import java.util.Scanner;

public class Unique_Number_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans = single_Number(arr);
        System.out.println(ans);
    }

    private static int single_Number(int[] arr) {
        int n = 100000000;
        int [] ar = new int[n];
        int [] ar2 = new int[n];
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                int k = -1 * arr[i];
                ar2[k]++;
            }else {
                int k = arr[i];
                ar[k]++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (ar2[i]==1){
                ans = -1 * i;

            }
        }

        for (int i = 0; i < n; i++) {
            if (ar[i]==1){
                ans = i;

            }
        }
        return ans;
    }
}
