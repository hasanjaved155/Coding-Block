package assignment_Recursion_BackTracking_10;

import java.util.Scanner;

public class Rat_In_Maze {
    static long visit = 0;
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) {
            String str = scanner.next();
            for (int j = 0; j < str.length(); j++) {
                maze[i][j] = str.charAt(j);
            }
        }
        long[][] ans = new long[n][m];
        ratMaze(maze,0,0,ans);
        if (visit == 0){
            System.out.println(-1);
        }
    }

    private static void ratMaze(char[][] maze, int row, int col, long[][] ans) {
        if (row == maze.length - 1 && col == maze[0].length - 1 && maze[row][col] != 'X'){
            ans[row][col] = 1;
            visit = 1;
            count++;
            if (count == 1) {
                display(ans);
            }
            return;
        }

        if (row >= maze.length || col >= maze[0].length || maze[row][col] == 'X'){
            return;
        }
        maze[row][col] = 'X';
        ans[row][col] = 1;

        ratMaze(maze,row,col + 1,ans);//right
        ratMaze(maze, row + 1, col, ans);//down
        if (count == 0) {
            maze[row][col] = 'O';
        }
        ans[row][col] = 0;
    }

    private static void display(long[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
