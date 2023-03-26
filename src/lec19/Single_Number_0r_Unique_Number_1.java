package lec19;

public class Single_Number_0r_Unique_Number_1 {
    public static void main(String[] args) {
        int [] arr = {2,3,5,2,7,5,7};
        int ans = single(arr);
        System.out.println(ans);
    }

    private static int single(int[] arr) {
        int bit = 0;
        for (int i = 0; i < arr.length; i++) {
            bit = bit ^ arr[i];
        }
        return bit;
    }
}
