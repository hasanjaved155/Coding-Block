package lec19;

public class Is_Set_2 {
    public static void main(String[] args) {
        int n = 67;
        int i = 4;
//        int x = n >> i;
//        if ((x & 1) != 0) System.out.println("Set");
//        else System.out.println("UnSet");
        if (Isset(n,i)) System.out.println("Set");
        else System.out.println("UnSet");
    }

    private static boolean Isset(int n, int i) {
        int x = 1 << i;
        if ((n & x) != 0) return true;
        return false;
    }
}
