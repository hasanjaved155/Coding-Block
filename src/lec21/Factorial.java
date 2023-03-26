package lec21;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }

    private static int fact(int n) {

        // Head Recursion
        if (n == 0)return 1;// base case

        int ans = n * fact(n - 1);// ans in falling time
        return ans;
    }
}
