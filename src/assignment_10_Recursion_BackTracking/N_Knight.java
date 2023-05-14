package assignment_10_Recursion_BackTracking;

import java.util.Scanner;

public class N_Knight {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [][] chess = new int[n][n];
        n_Knight(0,n,chess,"",-1);
        System.out.println();
        System.out.println(count);
    }

    private static void n_Knight(int knightStart,int tKnight,int[][] chess, String ans, int KnightPosition) {
        if (knightStart == tKnight){
            System.out.print(ans +"  ");
            count++;
            return;
        }
        for (int i = KnightPosition + 1; i < chess.length * chess.length; i++) {
            int row = i / chess.length;
            int col = i % chess.length;
            if (is_Safe_Knight(chess,row,col)) {
                chess[row][col] = 1;
                n_Knight(knightStart + 1,tKnight,chess, ans + "{"+ row + "-" + col + "}"+ " ", row * chess.length + col);
                chess[row][col] = 0;
            }
        }
    }
    private static boolean is_Safe_Knight(int[][] chess, int row, int col) {
        for (int i = row - 1,j = col - 2; i >= 0 && j >= 0; i--,j--) {
            if (chess[i][j] == 1)return false;
        }
        for (int i = row - 1,j = col + 2; i >= 0 && j < chess.length; i--,j++) {
            if (chess[i][j] == 1)return false;
        }

        for (int i = row - 2,j = col - 1; i >= 0 && j >= 0 ; i--,j--) {
            if (chess[i][j] == 1)return false;
        }

        for (int i = row - 2,j = col + 1; i >= 0 && j < chess.length ; i--,j++) {
            if (chess[i][j] == 1)return false;
        }

        return true;
    }
}
