package hacathon_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Monu_Bhaiya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();

        char[][] board = new char[n][m];
        for (int i = 0; i < board.length; i++) {
            String s = scanner.next();
            for (int j = 0; j < s.length(); j++) {
                board[i][j] = s.charAt(j);
            }
        }
        String[] word = new String[l];
        for (int i = 0; i < l; i++) {
            word[i] = scanner.next();
        }
        List<String> ans = wordBoard(board,word);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static List<String> wordBoard(char[][] board, String[] word) {
        List<String> list = new ArrayList<>();
        boolean[][] visit = new boolean[board.length][board[0].length];
        for (int i = 0; i < word.length; i++) {
            boolean ans = false;
            for (int j = 0; j < board.length; j++) {
                for (int k = 0; k < board[0].length; k++) {
                    if (search(board,word[i],j,k,0,visit)){
                        list.add(word[i]);
                        ans = true;
                        break;
                    }
                }
                if (ans){
                    break;
                }
            }
        }
        Collections.sort(list);
        return list;
    }

    private static boolean search(char[][] maze, String word, int row, int col, int index,boolean[][] visit) {
        if (index == word.length()){
            return true;
        }

        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || maze[row][col] != word.charAt(index)){
            return false;
        }
        visit[row][col] = true;
        int[] r = {-1,1,0,0};
        int[] c = {0,0,-1,1};

        for (int l = 0; l < c.length; l++) {
            if (search(maze, word, row + r[l], col + c[l], index + 1, visit)) {
                visit[row][col] = false;
                return true;
            }
        }
        visit[row][col] = false;
        return false;
    }
}
