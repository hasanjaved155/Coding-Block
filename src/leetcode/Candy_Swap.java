package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Candy_Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] alice = new int[n];
        for (int i = 0; i < n; i++) {
            alice[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] bob = new int[m];
        for (int i = 0; i < m; i++) {
            bob[i] = scanner.nextInt();
        }
        int[] ans = fairCandySwap(alice, bob);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] fairCandySwap(int[] alice, int[] bob) {
        int[] ans = new int[2];
        int j = 0;
        int s1 = 0;
        int s2 = 0;
        while (j < bob.length) {
            int i = 0;
            while (i < alice.length) {
                int k = alice[i];
                alice[i] = bob[j];
                bob[j] = k;
//            System.out.println(Arrays.toString(alice));
//            System.out.println(Arrays.toString(bob));
                for (int l = 0; l < alice.length; l++) {
                    s1 = s1 + alice[l];
                }
                for (int l = 0; l < bob.length; l++) {
                    s2 = s2 + bob[l];
                }
                if (s1 == s2) {
                    ans[0] = bob[j];
                    ans[1] = alice[i];
                    return ans;
                } else {
                    int m = alice[i];
                    alice[i] = bob[j];
                    bob[j] = m;
                    s1 = 0;
                    s2 = 0;
                }
                i++;
            }
            j++;
        }
        return null;
    }
}

