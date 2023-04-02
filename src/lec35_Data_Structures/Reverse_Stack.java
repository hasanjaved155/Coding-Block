package lec35_Data_Structures;

import java.util.Stack;

public class Reverse_Stack {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }

    private static void reverse(Stack<Integer> st) {
        if (st.isEmpty()){
            return;
        }
        int val = st.pop();
        reverse(st);
        insert(st,val);
    }

    private static void insert(Stack<Integer> st, int val) {
        if (st.isEmpty()){
            st.push(val);
            return;
        }

        int num = st.pop();
        insert(st,val);
        st.push(num);
    }
}
