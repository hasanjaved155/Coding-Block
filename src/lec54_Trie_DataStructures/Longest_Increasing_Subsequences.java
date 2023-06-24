package lec54_Trie_DataStructures;

public class Longest_Increasing_Subsequences {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthofLIS(nums));
    }

    private static int lengthofLIS(int[] nums) {
        int[] lis = new int[nums.length];
        lis[0] = nums[0];
        int len = 1;
        for (int i = 1; i < lis.length; i++) {
            if (lis[len - 1] < nums[i]){
                lis[len] = nums[i];
                len++;
            }else {
                int index = search(lis,0,len - 1,nums[i]);
                lis[index] = nums[i];
            }
        }
        return len;
    }

    private static int search(int[] lis, int start, int end, int item) {
        int ans = 0;
        while (start <= end){
            int mid = (start + end) / 2;
            if (lis[mid] >= item){
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
