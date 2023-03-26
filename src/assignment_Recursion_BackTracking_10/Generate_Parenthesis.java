package assignment_Recursion_BackTracking_10;

import java.util.Scanner;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        parenthesis("(",1,0,n);
    }

    private static void parenthesis(String ans, int open,int close , int n) {
        if (open == n && close == n){
            System.out.println(ans);
            return;
        }
        if (close < open){
            parenthesis(ans + ")",open , close + 1,n);
        }
        if (open < n){
            parenthesis(ans + "(",open + 1,close,n);
        }
    }
}
