package lec9;

public class Rotate_Array_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

    }

    private static void rotate(int[] nums, int k) {
        k = k % nums.length;

        for (int i = 0; i < k; i++) {
            reverse(nums,i);
        }

//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i]+" ");
//        }
        System.out.println(nums);
    }

    private static void reverse(int[] nums, int k) {
        int temp = nums[nums.length - 1];

        for (int j = nums.length - 2; j >= 0; j--) {
            nums[j + 1] = nums[j];
        }
        nums[0] = temp;
    }
}
