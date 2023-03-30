package leetcode;

public class Valid_Perfect_Square {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(isPerfectSquare(n));
    }

    private static boolean isPerfectSquare(int n) {
        return binary_Search(n,2);
    }

    private static boolean binary_Search(int n, int k) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (Math.pow(mid,k)==n){
                return true;
            }
            else if (Math.pow(mid,k) < n){
                start = mid + 1;
            }
            else end = mid-1;
        }
        return false;
    }
}
