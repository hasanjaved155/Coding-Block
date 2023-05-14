package assignment_11_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Implement_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        java.util.Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(scanner.nextInt());
        }
        System.out.println(minimum(st));
    }

    private static int minimum(Stack<Integer> st) {
        int ans = st.pop();
        while (!st.isEmpty()){
            if (ans < st.peek())st.pop();
            else ans = st.pop();
        }
        return ans;
    }
}
