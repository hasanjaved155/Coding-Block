package assignment_11_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Mid_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer>st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(scanner.nextInt());
        }
        System.out.println(mid(st));
    }

    private static int mid(Stack<Integer> st) {
        int start = 0;
        int end = st.size() - 1;
        return st.get((start + end) / 2);
    }
}
