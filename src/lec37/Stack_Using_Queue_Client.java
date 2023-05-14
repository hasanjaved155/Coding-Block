package lec37;

public class Stack_Using_Queue_Client {
    public static void main(String[] args) throws Exception {
        Stack_Using_Queue st = new Stack_Using_Queue();
        st.push(10);
        st.push(20);
        st.push(1);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
