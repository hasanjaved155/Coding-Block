package lec8;

public class Static_Var {
    static int val = 100;
    public static void main(String[] args) {
        fun(8,5);
        System.out.println(val);
    }

    private static void fun(int x, int y) {
        x = x+9;
        System.out.println(x);
        System.out.println(val);
        val = val - 9;
        System.out.println(val);
    }
}
