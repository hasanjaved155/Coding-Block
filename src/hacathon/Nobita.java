package hacathon;

import java.util.Scanner;

public class Nobita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int n = scanner.nextInt();

            int ans = nobita(x, n);
            System.out.println(ans);
        }
    }

    private static int nobita(int x, int n) {
        int r = x % n;
        if ((x-r)%n == 0){
            int ans = Math.min((n-r),r);
            return ans;
        } else if (r == 0) {
            return r;
        }else return (n - r);
    }
}
