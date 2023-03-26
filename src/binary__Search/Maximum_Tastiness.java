package binary__Search;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Tastiness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        int ans = maximumTastiness(arr,k);
        System.out.println(ans);
    }

    private static int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int n = price.length;
        int lo = 0;
        int hi =  price[n-1] - price[0];

        while (lo < hi) {
            int mid = 1 + lo + (hi - lo) / 2;
            if(searchFunction(mid, price, k)) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }

        return lo;
    }

    private static boolean searchFunction(int target, int[] price, int k) {
        int prev = price[0];
        int c = 1;
        for(int i = 1; i < price.length; i++) {
            if(price[i] - prev >= target) {
                c++;
                prev = price[i];
            }
            if(c == k) return true;
        }
        return false;
    }
}
