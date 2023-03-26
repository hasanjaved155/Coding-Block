package assignment_6;

import java.util.Scanner;

public class Murthal_Prantha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();//no. of paratha
        int l = scanner.nextInt();//no. of cooks
        int [] ranks = new int[l];
        for (int i = 0; i < l; i++) {
            ranks[i] = scanner.nextInt();
        }
        int ans = murthal_Prantha(ranks,p,l);
        System.out.println(ans);
    }

    private static int murthal_Prantha(int[] ranks, int p, int l) {
        int start = -1;
        int end = Integer.MAX_VALUE;
        int ans = 0;
        while(start<=end){
            int mid = (start + end)/2;
            if (isPossible(ranks,p,l,mid)){
                ans = mid;
                end = mid - 1;
            }else start = mid + 1;
        }
        return ans;
    }

    private static boolean isPossible(int[] ranks, int p, int l, int mid) {
        int parantha = 0;
        int time = 0;
        for (int i = 0; i < l; i++) {
            time = ranks[i];
            int j = 2;
            while(time <= mid){
                parantha++;
                time = time + (ranks[i]*j);
                j++;
            }
            if (parantha>=p)return true;
        }
        return false;
    }
}
