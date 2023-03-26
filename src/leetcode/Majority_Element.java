package leetcode;

import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] arr) {
        int n = 100000;
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
        int max2 = ar2[0];
        for (int i = 1; i < n; i++) {
            if (ar2[i]>=1 && ar2[i] > max2){
                 ans = -1 * i;
                 max2 = ar2[i];
            }
        }
        int max = ar[0];
        for (int i = 1; i < n; i++) {
            if (ar[i]>=1 && ar[i] > max){
                 ans = i;
                 max = ar[i];
            }
        }
        return ans;
    }
}
