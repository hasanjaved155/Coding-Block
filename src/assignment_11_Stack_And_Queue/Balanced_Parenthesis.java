package assignment_11_Stack_And_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Parenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        validParenthesis(str);
    }

    private static void validParenthesis(String str) {
        Stack<Character>st = new Stack<>();
        int i = 0;
        while (i < str.length()){
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                st.push('(');
            } else if (ch == ')' && st.peek() == '(' && !st.isEmpty()) {
                st.pop();
            }
            else if (ch == '}' && st.peek() == '{' && !st.isEmpty()) {
                st.pop();
            }
            else if (ch == ']' && st.peek() == '[' && !st.isEmpty()) {
                st.pop();
            }else{
                System.out.println("No");
                return;
            }
            i++;
        }
        if (st.size() >= 1){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
