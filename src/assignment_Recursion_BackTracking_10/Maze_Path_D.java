package assignment_Recursion_BackTracking_10;

import java.util.Scanner;

public class Maze_Path_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("\n"+mazePath(0,0,n - 1,m - 1,""));
    }

    private static int mazePath(int srow, int scol, int erow, int ecol,String ans) {
        if (srow > erow || scol > ecol)return 0;
        if (srow == erow && scol == ecol){
            System.out.print(ans + " ");
            return 1;
        }
        int m1 = mazePath(srow + 1,scol,erow,ecol,ans + "V");
        int m2 = mazePath(srow,scol + 1,erow,ecol,ans + "H");
        int m3 = mazePath(srow + 1,scol + 1,erow,ecol,ans + "D");
        return m1 + m2 + m3;
    }
}
