package lec35_Data_Structures;

public class Stack_Access {
    public static void main(String[] args) throws Exception {
        Stack st = new Stack();
        Stack st1 = new Stack(10);
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        st1.Display();
        st1.push(6);
        System.out.println(st1.peek());
        //System.out.println(st.isFull());
    }
}
