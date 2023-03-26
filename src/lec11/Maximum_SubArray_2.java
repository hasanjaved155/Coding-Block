package lec11;

public class Maximum_SubArray_2 {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int ans = maxSubArray(nums);
        System.out.println(ans);
    }
    // ---------------------Kaden's Algorithm--------------------------//
    private static int maxSubArray(int[] nums) {
        if (nums == null || nums.length==0)return 0;

        int ans = Integer.MIN_VALUE; // -2^31
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum =sum + nums[i];
            ans = Math.max(ans,sum);

            if (sum < 0){
                sum = 0;
            }
        }
        return ans;
    }
}
