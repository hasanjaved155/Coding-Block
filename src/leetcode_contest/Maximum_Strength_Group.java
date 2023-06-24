package leetcode_contest;

import java.util.Arrays;
import java.util.LinkedList;

public class Maximum_Strength_Group {
    public static void main(String[] args) {
        int[] nums = {3,-1,-5,2,5,-9};
        System.out.println(maxStrength(nums));
    }

    private static long maxStrength(int[] nums) {
        // if in an array only one element is present
        if (nums.length == 1){
            return nums[0];
        }

        int negativeNumberCount = 0;// count the negative numbers in an array
        int greaterNegativeNumber = Integer.MIN_VALUE;// store the larger negative number
        int greaterNumber = Integer.MIN_VALUE;// store the larger positive number
        long product = 1;
        for (int i = 0; i < nums.length; i++) {
            // now update the values of negativeNumberCount,greaterNegativeNumber,greaterNumber
            if (nums[i] < 0){
                negativeNumberCount++;
                greaterNegativeNumber = Math.max(greaterNegativeNumber, nums[i]);
            }
            greaterNumber = Math.max(greaterNumber, nums[i]);

            if (nums[i] != 0){
                product *= nums[i];
            }
        }
        // this is because if an array is like {0,0,-2}. If some zeros are present are present in an array with atmost one negative number
        if (greaterNumber == 0 && negativeNumberCount <= 1){
            return 0;
        }
        // if count of negative numbers in an is odd
        if (negativeNumberCount % 2 != 0){
            return product / greaterNegativeNumber;
        }
        return product;
    }
}
