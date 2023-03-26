package lec30;

public class N_Queen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        print(board,n,0);

    }

    private static void print(boolean[][] board, int tq, int row) {

        if (tq == 0){
            display(board);
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            if (isSafeQueen(board,row,col)){
                board[row][col] = true;
                print(board,tq - 1,row + 1);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafeQueen(boolean[][] board, int row, int col) {
        for (int i = row - 1,j = col; i >= 0 ; i--) {
            if (board[i][j])return false;
        }
        for (int i = row - 1,j = col - 1; i >= 0 && j >= 0 ; i--,j--) {
            if (board[i][j])return false;
        }
        for (int i = row - 1,j = col + 1; i >= 0 && j < board.length ; i--,j++) {
            if (board[i][j])return false;
        }
        return true;
    }

    private static void display(boolean[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
