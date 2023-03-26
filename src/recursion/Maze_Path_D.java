package recursion;

import java.util.Scanner;

public class Maze_Path_D {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        maze_Path(1, 1, n, m, "");
        System.out.println();
        System.out.println(count);
    }

    private static void maze_Path(int srow, int scol, int erow, int ecol, String ans) {
        if (srow > erow || scol > ecol){
            return;
        }
        if (srow == erow && scol == ecol){
            System.out.print(ans+" ");
            count++;
            return;
        }
        maze_Path(srow+1,scol,erow,ecol,ans+"V");
        maze_Path(srow,scol+1,erow,ecol,ans+"H");
        maze_Path(srow + 1, scol + 1, erow, ecol, ans + "D");
    }
}
