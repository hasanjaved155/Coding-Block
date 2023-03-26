package assignment_Recursion_BackTracking_10;

import java.util.Scanner;

public class Sudoku_Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        print(grid, 0, 0);
    }

    private static void print(int[][] grid, int row, int col) {
        if (col == 9){
            col = 0;
            row = row + 1;
        }
        if (row == 9){
            display(grid);
            return;
        }
        if (grid[row][col] != 0){
            print(grid,row,col + 1);
        }else{
            for (int val = 1; val <= 9 ; val++) {
                if (isSafe(grid,row,col,val)){
                    grid[row][col] = val;
                    print(grid,row,col + 1);
                    grid[row][col] = 0;
                }
            }
        }
    }

    private static boolean isSafe(int[][] grid, int row, int col, int val) {
        for (int i = 0; i < 9 ; i++) {
            if (grid[i][col] == val){
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == val){
                return false;
            }
        }
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3 ; j++) {
                if (grid[i][j] == val){
                    return false;
                }
            }
        }
        return true;
    }

    private static void display(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
