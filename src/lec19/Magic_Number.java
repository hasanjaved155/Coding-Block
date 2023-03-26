package lec19;

public class Magic_Number {
    public static void main(String[] args) {
        int n = 6
                ;
        System.out.println(magic(n));
    }

    private static int magic(int n) {
        int ans = 0;
        int mul = 5;
        while (n > 0){
            if ((n & 1) != 0) ans = ans + mul;
            mul *= 5;
            n >>= 1;
        }
        return ans;
    }
}
