package lec25;

public class Generate_Parenthesiss {
    public static void main(String[] args) {
        int n = 3;
        parenthesis("(",1,0,n);
    }

    private static void parenthesis(String ans, int open,int close , int n) {
        if (open == n && close == n){
            System.out.print(ans + " ");
            return;
        }


        if (open < n){
            parenthesis(ans + "(",open + 1,close,n);
        }
        if (close < open){
            parenthesis(ans + ")",open , close + 1,n);
        }
    }
}
