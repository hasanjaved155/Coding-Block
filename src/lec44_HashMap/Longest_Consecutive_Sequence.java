package lec44_HashMap;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean>map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] - 1)){
                map.put(nums[i],false);
            } else{
                map.put(nums[i],true);
            }
            if (map.containsKey(nums[i] + 1)){
                map.put(nums[i] + 1,false);
            }
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])){
                int count = 0;
                int val = nums[i];
                while(map.containsKey(val)){
                    count++;
                    val++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}
