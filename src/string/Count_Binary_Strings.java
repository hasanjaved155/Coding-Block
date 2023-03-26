package string;

import java.util.Scanner;

public class Count_Binary_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long ans = count(n);
            System.out.println(ans);
        }
    }

    private static long count(int n) {

        long [] a = new long[n];
        long [] b = new long[n];
        a[0] = 1;
        b[0] = 1;
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + b[i - 1];
            b[i] = a[i - 1];
        }
        long ans = a[n - 1] + b[n - 1];
        return ans;
    }
}
