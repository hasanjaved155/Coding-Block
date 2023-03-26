package lec19;

public class Is_Set {
    public static void main(String[] args) {
        int n = 84;
        int i = 4;
//        int x = n >> i;
//        if ((x & 1) != 0) System.out.println("Set");
//        else System.out.println("UnSet");
        if (Isset(n,i)) System.out.println("Set");
        else System.out.println("UnSet");
    }

    private static boolean Isset(int n, int i) {
        int x = n >> i;
        if ((x & 1) != 0) return true;
        return false;
    }
}
