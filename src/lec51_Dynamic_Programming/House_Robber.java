package lec51_Dynamic_Programming;

import java.util.Arrays;

public class House_Robber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

    private static int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        //return robbertd(nums, nums.length - 1, dp);
        //return robbertd(nums, 0, dp);
        return robberbu(nums);
    }

    private static int robberbu(int[] nums) {
        if (nums.length == 1)return nums[0];

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);

        for (int i = 2; i < dp.length; i++) {
            int rob = nums[i] + dp[i - 2];
            int donrob =  dp[i - 1];
            dp[i] = Math.max(rob, donrob);
        }
        return dp[dp.length - 1];
    }

    private static int robbertd(int[] nums, int i, int[] dp) {
//        if (i < 0){
//            return 0;
//        }
//
//        if (dp[i] != -1)return dp[i];
//        int rob = nums[i] + robbertd(nums, i - 2, dp);
//        int donrob = robbertd(nums, i - 1, dp);
//        dp[i] = Math.max(rob, donrob);
//        return Math.max(rob, donrob);

        //-----------or-------------//
        if (i >= nums.length){
            return 0;
        }

        if (dp[i] != -1)return dp[i];
        int rob = nums[i] + robbertd(nums, i + 2, dp);
        int donrob = robbertd(nums, i + 1, dp);
        dp[i] = Math.max(rob, donrob);
        return Math.max(rob, donrob);
    }
}
