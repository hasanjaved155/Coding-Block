package bitmasking;

import java.util.Scanner;
import java.util.Vector;

public class Max_Cost_Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int ans = max_Cost(arr);
        System.out.println(ans);
    }

    private static int max_Cost(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans + (arr[i] * i);
        }
        return ans;
    }
}
