package leetcode_contest;

public class Check_Knight_Tour {
    public static void main(String[] args) {
        int[][] grid = {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};

        System.out.println( checkValidGrid(grid));
    }

    private static boolean checkValidGrid(int[][] grid) {

        return knight(grid,0,0,0);
    }

    private static boolean knight(int[][] grid, int row, int col, int count) {

        if (count == grid.length * grid[0].length){
            return true;
        }
        int[] r = {-2,-2,2,2,1,-1,1,-1};
        int[] c = {-1,1,-1,1,2,2,-2,-2};

        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != count){
            return false;
        }
        for (int i = 0; i < c.length; i++) {
            boolean ans = knight(grid,row + r[i],col + c[i],count + 1);
            if (ans){
                return true;
            }
        }
        return false;
    }
}
