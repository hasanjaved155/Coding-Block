package lec35_Data_Structures;

public class Stack_Access {
    public static void main(String[] args) throws Exception {
        Stack st = new Stack();
        Stack st1 = new Stack(10);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.Display();
        st.push(6);
        System.out.println(st.isFull());
    }
}
