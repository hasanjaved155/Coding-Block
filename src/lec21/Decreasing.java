package lec21;

public class Decreasing {
    public static void main(String[] args) {
        int n = 5;
        dec(n);
    }

    private static void dec(int n) {

        // Tail Recursion
        if (n == 0)return;

        System.out.println(n);// ans in rising time
        dec(n - 1);
    }
}
