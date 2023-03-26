package assignment_6;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int noc = scanner.nextInt();
        int [] stall = new int[n];
        for (int i = 0; i < n; i++) {
            stall[i] = scanner.nextInt();
        }

        Arrays.sort(stall);
        int ans = aggressiveCow(stall,n,noc);
        System.out.println(ans);
    }

    private static int aggressiveCow(int[] stall, int n, int noc) {

        int start = stall[0];
        int end = stall[n-1];

        int ans = 0;
        while (start<=end){

            int mid = (start+end)/2;
            if (isPossible(stall, noc, mid)){
                ans = mid;
                start = mid + 1;
            }else end = mid - 1;
        }
        return ans;
    }

    private static boolean isPossible(int[] stall, int noc, int mid) {

        int cow = 1;
        int dis = stall[0];

        for (int i = 0; i < stall.length; i++) {
            if (stall[i] - dis >= mid){
                dis = stall[i];
                cow++;
            }
            if (cow == noc)return true;
        }
        return false;
    }
}
