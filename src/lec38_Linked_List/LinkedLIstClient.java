package lec38_Linked_List;

public class LinkedLIstClient {
    public static void main(String[] args) throws Exception {
        Linked_List ll = new Linked_List();
//        ll.addFirst(10);
//        ll.addFirst(20);
//        ll.addFirst(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addIndex(3,2);
        ll.Display();
    }
}
