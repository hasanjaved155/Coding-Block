package lec21;

public class Increasing {
    public static void main(String[] args) {
        int n = 5;
        inc(n);
    }

    private static void inc(int n) {

        // Head Recursion
        if (n == 0)return;

        inc(n-1);
        System.out.println(n);// ans in falling time
    }
}
