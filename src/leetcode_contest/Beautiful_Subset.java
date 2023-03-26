package leetcode_contest;

import java.util.Scanner;

public class Beautiful_Subset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(beautifulSubsets(arr,k));
    }

    private static int beautifulSubsets(int[] arr, int k) {
        int count = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] != k){
                    count++;
                }else {
                    int ans = arr[i] - arr[j];
                    if (ans < 0) {
                        ans = ans * -1;
                        if (ans != k) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
