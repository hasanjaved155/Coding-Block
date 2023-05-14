package leetcode;

public class Monotonic_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};
        System.out.println(isMonotonic(arr));
    }

    private static boolean isMonotonic(int[] arr) {
         boolean ans1 = increasing(arr);
         boolean ans2 = decresing(arr);
         return ans1 | ans2;
    }

    private static boolean decresing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]){

            }else {
                return false;
            }
        }
        return true;

    }

    private static boolean increasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]){

            }else {
                return false;
            }
        }
        return true;
    }
}
