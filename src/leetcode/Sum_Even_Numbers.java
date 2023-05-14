package leetcode;

public class Sum_Even_Numbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};

        int[] ans = sumEvenAfterQueries(nums,queries);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] arr = new int[nums.length];
        int sum = sumArray(nums);

        for (int i = 0; i < queries.length; i++) {
            if (nums[queries[i][1]] % 2 == 0){
                sum = sum - nums[queries[i][1]];
                nums[queries[i][1]] += queries[i][0];
                if (nums[queries[i][1]] % 2 == 0){
                    sum += nums[queries[i][1]];
                }
            }else {
                nums[queries[i][1]] += queries[i][0];
                if (nums[queries[i][1]] % 2 == 0){
                    sum += nums[queries[i][1]];
                }
            }
            arr[i] = sum;
        }
        return arr;
    }

    private static int sumArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                sum += nums[i];
            }
        }
        return sum;
    }
}
