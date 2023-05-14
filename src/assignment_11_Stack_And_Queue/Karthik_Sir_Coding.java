package assignment_11_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Karthik_Sir_Coding {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        code(n);
    }

    private static void code(int n) {
        Stack<Integer>st = new Stack<>();
        int i = 0;
        while (i < n){
            int query = scanner.nextInt();
            if (query == 2)st.push(scanner.nextInt());
            else if (query == 1 && !st.isEmpty()) System.out.println(st.pop());
            else if (st.isEmpty())System.out.println("No Code");
            i++;
        }
    }
}
