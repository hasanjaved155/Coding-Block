package lec12;

import java.util.Scanner;

public class K_th_Root {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int ans = binarySearch(n, k);
        System.out.println(ans);
    }
    private static int binarySearch(int n, int k) {
        int start = 1;
        int end = n;
        int ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (Math.pow(mid,k)<=n){
                ans = mid;
                start = mid + 1;
            }
            else end = mid-1;
        }
        return ans;
    }
}
