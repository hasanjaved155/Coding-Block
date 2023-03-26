package lec27;

public class Queen_Permutation {
    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2;
        queenPermutation(board,tq,0,"");
    }

    private static void queenPermutation(boolean[] board, int tq, int iq  , String ans) {
        if (iq == tq){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i] == false){
                board[i] = true;
                queenPermutation(board,tq,iq + 1,ans + "b" + i + "q" + iq);
                board[i] = false;

            }
        }
    }
}
