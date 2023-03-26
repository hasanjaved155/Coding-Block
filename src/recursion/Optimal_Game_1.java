package recursion;

import java.util.*;

public class Optimal_Game_1{
        //static HashMap<Integer,HashMap<Integer,Integer>>dp = new HashMap<>();
        static int [][] dp;
        static Scanner scanner = new Scanner(System.in);
        static int n = scanner.nextInt();
        static int [] arr;
        public static void main(String[] args) {
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            dp = new int[n+1][n+1];

            for (int i = 0; i < n+1; i++) {
                for (int j = 0; j < n+1; j++) {
                    dp[i][j] = -1;
                }
            }

            int ans = optGame(0,n-1);
            System.out.println(ans);
        }

        private static int optGame(int start, int end) {
            if (start>end)return 0;

            if (start == end)return end;
            //if(dp.containsKey(start) && dp.get(start).containsKey(end))return dp.get(start).get(end);

            if (dp[start][end] != -1)return dp[start][end];

            // if piyush start with index end
            int a1 = arr[end];
            int a2 = optGame(start,end-2);
            int a3 = optGame(start + 1,end - 1);
            int ans = Math.min(a2,a3);
            System.out.println(a2+" "+a3+" "+ans);
            int pi = a1 + ans;

            // if piyush start with index start
            int b1 = arr[start];
            int b2 = optGame(start+2,end);
            int b3 = optGame(start + 1,end - 1);
            int ans2 = Math.min(b2,b3);
            int pi2 = b1 + ans2;
            int ans1 = Math.max(pi,pi2);

//            HashMap<Integer,Integer>dp2 = dp.get(start);
//            if (dp2==null){
//                dp2 = new HashMap<>();
//            }
//            dp2.put(end,ans1);
//            dp.put(start,dp2);

            dp[start][end] = ans1;
            return ans1;
        }
}
