package assignment_11_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class The_Queue_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            game(arr);
        }
    }

    private static void game(int[] arr) {
        Stack<Integer>st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)st.push(arr[i]);
            else if (!st.isEmpty() && arr[i] == 0) st.pop();
            else {
                System.out.println("Invalid");
                return;
            }
        }
        System.out.println("Valid");
    }
}
