package lec12;

import java.util.Scanner;

public class Kth_Root {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int ans = k_Root(n,k);
        System.out.println(ans);
    }

    private static int k_Root(int n, int k) {

        int i = 1;
        int max = 0;
        while(i<=n){
            if (Math.pow(i,k)<n)max = i;
            i++;
        }
        return max;
    }
}
