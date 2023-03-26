package lec19;

public class Missing_Number {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,8};
        int n = 8;
        
        int ans = missing(arr,n);
        System.out.println(ans);
        
    }

    private static int missing(int[] arr, int n) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        for (int i = 1; i <= n ; i++) {
            ans = ans ^ i;
        }
        return ans;
    }
}
