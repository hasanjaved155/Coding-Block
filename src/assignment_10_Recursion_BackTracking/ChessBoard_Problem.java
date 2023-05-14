package assignment_10_Recursion_BackTracking;

import java.util.Scanner;

public class ChessBoard_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("\n"+chess_board(n,"",0,0));
    }

    private static int chess_board(int n, String ans,int row,int col) {

        if (row == n - 1 && col == n - 1){
            System.out.print(ans +  "{" + row + "-" + col + "} ");
            return 1;
        }
        if (row >= n || col >= n){
            return 0;
        }

        int count = 0;
        //knight moves always positive for row and col
        count+= chess_board(n,ans + "{"+row+"-"+col+"}K",row + 2,col + 1);
        count+= chess_board(n,ans + "{"+row+"-"+col+"}K",row + 1,col + 2);

        // rook
        // rook in col
        if (row == 0 || col == 0 || col == n - 1 || row == n - 1) {
            for (int i = 1; i <= n; i++) {
                count+= chess_board(n, ans + "{" + row + "-" + col + "}R", row, col + i);
            }
            // rook in row
            for (int i = 1; i <= n; i++) {
                count+= chess_board(n, ans + "{" + row + "-" + col + "}R", row + i, col);
            }
        }

        // bishope
        if (row == col || row + col == n - 1){
            for (int i = 1; i <= n ; i++) {
                count+= chess_board(n,ans + "{"+row+"-"+col+"}B",row + i,col + i);
            }
        }
        return count;
    }
}
