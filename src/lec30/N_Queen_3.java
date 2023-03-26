package lec30;

public class N_Queen_3 {
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        print(board,0);

    }

    private static void print(int[][] board, int row) {

        if (row == board.length){
            display(board);
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            if (isSafeQueen(board,row,col)){
                board[row][col] = 1;
                print(board,row + 1);
                board[row][col] = 0;
            }
        }
    }

    private static boolean isSafeQueen(int[][] board, int row, int col) {
        for (int i = row - 1,j = col; i >= 0 ; i--) {
            if (board[i][j] == 1)return false;
        }
        for (int i = row - 1,j = col - 1; i >= 0 && j >= 0 ; i--,j--) {
            if (board[i][j] == 1)return false;
        }
        for (int i = row - 1,j = col + 1; i >= 0 && j < board.length ; i--,j++) {
            if (board[i][j] == 1)return false;
        }
        return true;
    }

    private static void display(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
