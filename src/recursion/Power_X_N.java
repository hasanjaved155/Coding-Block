package recursion;

import java.util.Scanner;

public class Power_X_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();

        double ans = myPow(x, n);
        System.out.println(ans);
    }

    private static double myPow(double x, int n) {

        double m = n;
        if (n < 0) {
            m = -m;
            x = 1 / x;
        }
        double ans1 = pow(x, m);

        return ans1;

    }

    private static double pow(double x, double n) {

        if(n==0)
            return 1;
        if(n%2==0)
            return pow(x*x, n/2);
        else
            return x * pow(x,n-1);
    }
}
