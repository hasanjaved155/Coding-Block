package lec20;

public class Magic_Number {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(magic(n));
    }

    private static int magic(int n) {
        int mul = 5;
        int ans = 0;
        while(n > 0){
            if ((n & 1) != 0){
                ans = ans + mul;
            }
            mul = mul * 5;
            n = n >> 1;
        }
        return ans;
    }
}
