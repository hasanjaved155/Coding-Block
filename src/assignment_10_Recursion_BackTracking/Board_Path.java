package assignment_10_Recursion_BackTracking;

import java.util.Scanner;

public class Board_Path {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int diceFace = scanner.nextInt();
        System.out.println("\n"+boardPath(0,n,diceFace,""));
    }

    private static int boardPath(int start ,int end, int diceFace,String ans) {
        if (start == end){
            System.out.print(ans + " ");
            return 1;
        }
        if (start > end)return 0;
        int count = 0;
        for (int step = 1; step <= diceFace; step++) {
            count = count + boardPath(start + step , end,diceFace ,ans + step);
        }
        return count;
    }
}
