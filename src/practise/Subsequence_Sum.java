package practise;

import java.util.Scanner;

public class Subsequence_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(sum(arr));
    }

    private static int sum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                int ans = arr[i] - arr[j];
                if (ans >= 0){
                    count = count + ans;
                }else{
                    count = count - ans;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int ans = arr[i] - arr[i + 1];
            if (ans >= 0){
                max = Math.max(max,ans);
            }else{
                max = Math.max(max,-ans);
            }
        }
        return count + max;
    }
}
