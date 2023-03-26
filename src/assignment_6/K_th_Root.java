package assignment_6;

import java.util.Scanner;

public class K_th_Root {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();

            long ans = kthRoot(n,k);
            System.out.println(ans);
        }
    }

    private static long kthRoot(long n, long k) {
        long start = 1;
        long end = n;
        long ans = 0;

        while(start <= end){

            long mid = (start + end)/2;
            if (Math.pow(mid,k) <= n){
                ans = mid;
                start = mid + 1;
            }else end = mid - 1;
        }
        return ans;
    }
}
