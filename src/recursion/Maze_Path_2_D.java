package recursion;

import java.util.Scanner;

public class Maze_Path_2_D {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        maze_Path(1, 1, n,"");
        System.out.println();
        System.out.println(count);
    }

    private static void maze_Path(int srow, int scol, int n,String ans) {
        if (srow > n || scol > n){
            return;
        }
        if (srow == n && scol == n){
            System.out.print(ans+" ");
            count++;
            return;
        }
        maze_Path(srow+1,scol,n,ans+"V");
        maze_Path(srow,scol+1,n,ans+"H");
        if (srow == scol) {
            maze_Path(srow + 1, scol + 1,n, ans + "D");
        }
    }
}
