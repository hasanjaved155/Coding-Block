package lec24;

public class Count_Collison {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(monkeyMove(n));
    }

    private static int monkeyMove(int n) {
        long ans = (pow(2,n)-2)%1000000007;

        return (int) ans;
    }

    private static long pow(int ans, int n) {
        if (n == 1){
            return ans;
        }

        return pow((ans * 2)%100000007, n-1 );
    }
}
