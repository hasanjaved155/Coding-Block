package recursion;

import java.util.Scanner;

public class N_Queen {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [][] chess = new int[n][n];
        n_Queen(chess,"",0);
        System.out.println();
        System.out.println(count);
    }

    private static void n_Queen(int[][] chess, String ans, int row) {
        if (row == chess.length){
            display(chess);
            System.out.print(ans +"  ");
            count++;
            return;
        }
        for (int col = 0; col < chess.length; col++) {
            if (is_Safe_Queen(chess,row,col)) {
                chess[row][col] = 1;
                int r = row + 1;
                int c = col + 1;
                n_Queen(chess, ans + "{"+ r + "-" + c + "}"+ " ", row + 1);
                //n_Queen(chess,  row + 1);
                chess[row][col] = 0;
            }
        }
    }

    private static void display(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static boolean is_Safe_Queen(int[][] chess, int row, int col) {
        for (int i = row - 1,j = col; i >= 0 ; i--) {
            if (chess[i][j] == 1)return false;
        }
        for (int i = row - 1,j = col - 1; i >= 0 && j >= 0 ; i--,j--) {
            if (chess[i][j] == 1)return false;
        }
        for (int i = row - 1,j = col + 1; i >= 0 && j < chess.length ; i--,j++) {
                if (chess[i][j] == 1)return false;
        }
        return true;
    }
}
