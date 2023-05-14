package assignment_10_Recursion_BackTracking;

import java.util.Scanner;

public class Maze_Path_D2 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        mazePath(0,0,n - 1,"");
        System.out.println("\n"+count);
    }

    private static void mazePath(int srow, int scol, int end,String ans) {
        if (srow > end || scol > end)return;
        if (srow == end && scol == end){
            System.out.print(ans + " ");
            count++;
            return;
        }
        mazePath(srow + 1,scol,end,ans + "V");
        mazePath(srow,scol + 1,end,ans + "H");
        if (srow == scol || srow + scol == end) {
            mazePath(srow + 1, scol + 1, end, ans + "D");
        }
    }
}
