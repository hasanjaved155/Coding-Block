package leetcode;

public class Number_Unique_Digit {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countNumbersWithUniqueDigits(n));
    }

    private static int countNumbersWithUniqueDigits(int n) {
        if (n == 0)return 1;
        if (n == 1)return 10;

        int ans = 10;
        int start = 9;
        int mul = 9;
        for (int i = 2; i <= n; i++) {
            mul = mul * start;
            start = start - 1;
            ans = ans + mul;
        }
        return ans;
    }
}
