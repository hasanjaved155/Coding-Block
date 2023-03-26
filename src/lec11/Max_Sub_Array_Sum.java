package lec11;

public class Max_Sub_Array_Sum {
    public static void main(String[] args) {

        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int ans = maxSubArray(nums);
        System.out.println(ans);
    }

    private static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int [] MaxSub = new int[nums.length];
        for (int i = 0; i < MaxSub.length; i++) {

            if (i == 0)MaxSub[i] = nums[i];
            else MaxSub[i] = Math.max(nums[i],MaxSub[i-1] + nums[i]);

            if (MaxSub[i] > max)max = MaxSub[i];
        }
        return max;
    }
}
