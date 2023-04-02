package lec35_Data_Structures;

import java.util.Stack;

public class Insert_At_Last {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        insert(st);
        System.out.println(st);
    }

    private static void insert(Stack<Integer> st) {
        if (st.isEmpty()){
            st.push(60);
            return;
        }

        int val = st.pop();
        insert(st);
        st.push(val);
    }
}
