package leetcode;

import java.util.Arrays;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
        System.out.println(firstMissingPositive(arr));
    }

    private static int firstMissingPositive(int[] arr) {
        Arrays.sort(arr);
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0 || i != 0 && arr[i] == arr[i - 1]){

            }
            else if (arr[i] == ans){
                ans = ans + 1;
            }else{
                break;
            }
        }
        return ans;
    }
}
