package lec30;

public class Word_Search {
    public static void main(String[] args) {
        char[][] maze = { { 'A', 'B', 'C', 'E' },
                          { 'S', 'F', 'C', 'S' },
                          { 'A', 'D', 'E', 'E' } };
        String word = "ABCCED";
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j] == word.charAt(0)){
                    boolean ans = search(maze,word,i,j,0);
                    if (ans == true){
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }

    private static boolean search(char[][] maze, String word, int row, int col, int index) {
        if (index == word.length()){
            return true;
        }

        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || maze[row][col] != word.charAt(index)){
            return false;
        }
        maze[row][col] = '*';
        int[] r = {-1,1,0,0};
        int[] c = {0,0,-1,1};

        for (int l = 0; l < c.length; l++) {
            boolean ans = search(maze,word,row + r[l],col + c[l],index + 1);
            if (ans == true){
                return ans;
            }
        }
        maze[row][col] = word.charAt(index);
        return false;
    }
}
