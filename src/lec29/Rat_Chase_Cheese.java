package lec29;

import java.util.Scanner;

public class Rat_Chase_Cheese {
    static boolean f = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        char[][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) {
            String s = scanner.next();
            for (int j = 0; j < s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int[][] ans = new int[n][m];
        printMaze(maze,0,0,ans);
        if (f == false){
            System.out.println("NO PATH FOUND");
        }
    }

    private static void printMaze(char[][] maze, int col, int row,int[][] ans) {
        if (row == maze.length - 1 && col == maze[0].length - 1 && maze[row][col] != 'X'){
            ans[row][col] = 1;
            f = true;
            display(ans);
            return;
        }

        if (col < 0 || row < 0 || col >= maze[0].length || row >= maze.length || maze[row][col] == 'X')return;

        maze[row][col] = 'X';
        ans[row][col] = 1;
        printMaze(maze,col,row - 1,ans);//up
        printMaze(maze,col,row + 1,ans);//down
        printMaze(maze,col - 1,row,ans);//left
        printMaze(maze,col + 1,row,ans);//right
        maze[row][col] = 'O';
        ans[row][col] = 0;

    }

    private static void display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
