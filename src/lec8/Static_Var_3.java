package lec8;

public class Static_Var_3 {
    static int val = 100;
    public static void main(String[] args) {
        fun(8,5);
        System.out.println(val);
    }

    private static void fun(int x, int y) {
        x = x+9;
        System.out.println(x);
        System.out.println(val);
        int val = 9;
        Static_Var_3.val = Static_Var_3.val + 6;
        System.out.println(Static_Var_3.val);
    }
}
