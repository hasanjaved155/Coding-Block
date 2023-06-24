package dp_leetcode;

public class Ugly_Number {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(isugly(n));
    }

    private static boolean isugly(int n) {
        if (n <= 0){
            return false;
        }
        int[] arr = {2,3,5};
        int x = n;
        for (int i : arr){
           x = ugly(x,i);
        }
        return x == 1;
    }

    private static int ugly(int divident, int divisor) {
        while(divident % divisor == 0){
            divident /= divisor;
        }
        return divident;
    }
}
