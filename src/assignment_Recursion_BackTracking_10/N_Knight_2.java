package assignment_Recursion_BackTracking_10;

import java.util.Scanner;

public class N_Knight_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] chess = new int[n][n];
        System.out.println("\n"+n_Knight(chess,0,0, "",n));
    }

    private static int n_Knight(int[][] chess, int row, int col, String ans,int n) {
        if (n == 0){
            System.out.print(ans+"  ");
            return 1;
        }
        if (col == chess.length){
            row++;
            col = 0;
        }
        if (row >= chess.length){
            return 0;
        }
        int count = 0;
        if (is_Safe_Knight(chess,row,col)){
            chess[row][col] = 1;
            count+= n_Knight(chess,row,col + 1,ans+ "{" + row + "-" + col +"} ",n - 1);
            chess[row][col] = 0;
        }
        count+= n_Knight(chess,row,col + 1,ans,n);
        return count;
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
