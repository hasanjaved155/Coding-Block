package lec46_OOPS_Generics;

public class Linked_List <T>{
    public class Node{
        T val;
        Node next;
    }
    private Node head;
    private int size;
    private Node tail;
    public void addFirst(T item){
        Node nn = new Node();
        nn.val = item;
        if (size == 0){
            head = nn;
            tail = nn;
            size++;
        }else {
            nn.next = head;
            head = nn;
            size++;
        }
    }
    public void addLast(T item){
        if (size == 0){
            addFirst(item);
        }
        else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }
    public void addIndex(T item , int k) throws Exception{
        if (k == 0){
            addFirst(item);
        } else if (k == size) {
            addLast(item);
        }
        Node nn = new Node();
        nn.val = item;
        Node add = getNode(k - 1);
        nn.next = add.next;
        add.next = nn;
        size++;
    }
    public T removeFirst(){
        Node rv = head;
        if (size == 1){
            head = null;
            tail = null;
            size--;
        }else {
            head = head.next;
            size--;
            rv.next = null;
        }
        return rv.val;
    }
    public T removeLast() throws Exception{
        if (size == 1){
            return removeFirst();
        }else {
            Node rv = getNode(size - 2);
            T val = tail.val;
            rv.next = null;
            tail = rv;
            size--;
            return val;
        }
    }
    public T removeatIndex(int k) throws Exception{
        if (k == 0){
            removeFirst();
        } else if (k == size - 1) {
            return removeLast();
        }
        Node k_1th = getNode(k - 1);
        Node kth = k_1th.next;
        k_1th.next = kth.next;
        kth.next = null;
        size--;
        return kth.val;
    }
    private Node getNode(int k) throws Exception{
        if (k < 0 || k >= size){
            throw new Exception("K is invalid");
        }
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void Display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ->- ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println(size);
    }
    public T getFirst(){
        return head.val;
    }
    public T getLast(){
        return tail.val;
    }
    public T getatIndex(int k) throws Exception{
        return getNode(k).val;
    }

    public static void main(String[] args) {
        Linked_List<String> ll = new Linked_List();
        ll.addFirst("raj");
        ll.addFirst("kaju");
        ll.addFirst("anku");
        ll.addLast("puneet");
        ll.addLast("rupesh");
        ll.addLast("amisha");
        ll.Display();
    }
}
