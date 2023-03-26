package assignment_6;

import java.util.Scanner;

public class Maximum_Circular_Sum {
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

        int ans = Integer.MIN_VALUE; // -2^31
        int sum = 0;
        int ans_2 = Integer.MAX_VALUE;
        int sum_2 = 0;
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            ans = Math.max(ans, sum);
            if (sum < 0) sum = 0;

            sum_2 = sum_2 + nums[i];
            ans_2 = Math.min(ans_2,sum_2);
            if (sum_2 > 0) sum_2=0;

            total = total + nums[i];
        }
        if (ans<0)return ans;
        return Math.max(ans,total - ans_2);
    }
}
