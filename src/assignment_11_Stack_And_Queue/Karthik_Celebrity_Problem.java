package assignment_11_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Karthik_Celebrity_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
         findCelebrity(arr);
    }

    private static void findCelebrity(int[][] arr) {
        Stack<Integer>st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while(st.size() > 1){
            int a = st.pop();
            int b = st.pop();
            if (arr[a][b] == 1)st.push(b);
            else st.push(a);
        }
        int celebrity = st.pop();
        for (int i = 0; i < arr.length; i++) {
            if (i != celebrity && ((arr[i][celebrity] == 0) || (arr[celebrity][i] == 1))){
                System.out.println("No Celebrity");
                return;
            }
        }
        System.out.println(celebrity);
    }
}
