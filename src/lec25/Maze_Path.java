package lec25;

public class Maze_Path {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        mazePath(0,0,n - 1,m - 1,"");
    }

    private static void mazePath(int srow, int scol, int erow, int ecol,String ans) {
        if (srow > erow || scol > ecol)return;
        if (srow == erow && scol == ecol){
            System.out.print(ans + " ");
            return;
        }
        mazePath(srow + 1,scol,erow,ecol,ans + "V");
        mazePath(srow,scol + 1,erow,ecol,ans + "H");
    }
}
