package lec21;

public class Power {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.println(pow(a,b));
    }

    private static int pow(int a, int b) {

        // Head Recursion
        if (b == 0)return 1;

        //if (b == 1)return a;

        int ans = a * pow(a,b-1);
        return ans;
    }
}
