package lec35_Data_Structures;

public class Queue_Access {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.deque();
        q.enque(70);
        q.Display();
    }
}
