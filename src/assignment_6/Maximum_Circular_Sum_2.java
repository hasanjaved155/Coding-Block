package assignment_6;

import java.util.Scanner;

public class Maximum_Circular_Sum_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = scanner.nextInt();
            }
            int ans = Circular(nums);
            System.out.println(ans);
        }
    }

    private static int Circular(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int len_Sum = MaximumSum(nums);//maximum linear subarray
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] *= -1;
        }
        int mid_Sum = MaximumSum(nums);//inverse minimum linear subarray
        int curr = sum + mid_Sum;

        if (curr<0)return len_Sum;

        return Math.max(curr,len_Sum);

    }

    private static int MaximumSum(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            ans = Math.max(ans, sum);
            if (sum < 0) sum = 0;
        }
        return  ans;
    }
}
