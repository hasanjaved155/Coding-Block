package lec21;

public class Factorial_2 {
    public static void main(String[] args) {
        int n = 5;
       fact(n,1);
    }

    private static void fact(int n,int ans) {


        // Tail Recursion
        if (n == 0){
            System.out.println(ans);
            return;// base case
        }
         ans = ans * n;
        //System.out.println(ans);

        fact(n - 1,ans);
    }
}
