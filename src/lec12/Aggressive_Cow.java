package lec12;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scanner.nextInt();// no. of stall
            int noc = scanner.nextInt();// no. of cows

            int [] stall = new int[n];
            for (int i = 0; i < n; i++) {
                stall[i] = scanner.nextInt();//distance value of stall
            }
            Arrays.sort(stall);
            int ans = largestMinimumDistance(stall,n,noc);
            System.out.println(ans);
        }
    }

    private static int largestMinimumDistance(int[] stall, int n, int noc) {
        int start = stall[0];
        int end = stall[n-1];

        int ans = 0;

        while(start<=end){
            int mid = (start+end)/2;
            if (isPossible(stall,noc,mid)==true){
                ans = mid;
                start = mid + 1;
            }else end = mid - 1;
        }
        return ans;
    }

    private static boolean isPossible(int[] stall, int noc, int mid) {
        int cow = 1;
        int pos = stall[0];
        for (int i = 0; i < stall.length; i++) {
            if (stall[i] - pos >= mid){
                pos = stall[i];
                cow++;
            }
            if (cow == noc)return true;
        }
        return false;
    }
}
