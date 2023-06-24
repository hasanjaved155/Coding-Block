package dp_leetcode;

import java.util.Arrays;

public class House_Robber_2 {
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(rob(nums));
    }

    private static int rob(int[] nums) {
        if (nums.length == 1)return nums[0];
        int[] nums1 = new int[nums.length - 1];
        int[] nums2 = new int[nums.length - 1];
//        for (int i = 0; i < nums1.length; i++) {
//            nums1[i] = nums[i];
//        }
        System.arraycopy(nums, 0, nums1, 0, nums1.length);
//        for (int i = 0; i < nums2.length; i++) {
//            nums2[i] = nums[i + 1];
//        }
        System.arraycopy(nums, 1, nums2, 0, nums2.length);
        int ans1 = robberbu(nums1);
        int ans2 = robberbu(nums2);

        return Math.max(ans1,ans2);
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
}