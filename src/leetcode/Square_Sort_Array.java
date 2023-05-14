package leetcode;

public class Square_Sort_Array {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = sort(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }

    private static int[] sort(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        while (i <= j){
            int x = nums[i] * nums[i];
            int y = nums[j] * nums[j];
            if (x > y){
                arr[k] = x;
                i++;
            }else{
                arr[k] = y;
                j--;
            }
            k--;
        }
        return arr;
    }
}
