package lec11;

public class Maximum_SubArray {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int ans = maxSubArray(nums);
        System.out.println(ans);
    }

    private static int maxSubArray(int[] nums) {
        if (nums == null || nums.length==0)return 0;

        int ans = Integer.MIN_VALUE; // -2^31

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length ; j++) {
                sum = sum + nums[j];

                ans = Math.max(ans,sum);
            }
        }
        return ans;
    }
}
