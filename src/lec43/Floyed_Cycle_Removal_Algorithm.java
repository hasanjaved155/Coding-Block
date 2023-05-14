package lec43;

import lec38_Linked_List.Linked_List;

public class Floyed_Cycle_Removal_Algorithm {
    public class Node{
        int val;
        Node next;
    }
    private Node head;
    private int size;
    private Node tail;
    public void addFirst(int item){
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
    public void addLast(int item){
        if (size == 0){
            addFirst(item);
        }else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
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
    public void createCycle() throws Exception{
        Node nn = getNode(2);
        this.tail.next = nn;
    }
    public Node hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return slow;
            }
        }
        return null;
    }
    public void cycleRemoval(){
        Node meet = hasCycle(head);
        if (meet == null)return;

        Node temp = meet;
        int count = 1;
        while (temp.next != meet){
            temp = temp.next;
            count++;
        }
        Node fast = head;
        for (int i = 0; i < count; i++) {
            fast = fast.next;
        }
        Node slow = head;
        while (slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
    public void floyedCycle(){
        Node meet = hasCycle(head);
        System.out.println(meet.val);
        if (meet == null)return;
        Node fast = meet;
        Node slow = head;
        while (slow.next != fast.next){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast.next = null;
    }
    public void Display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ->- ");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) throws Exception {
        Floyed_Cycle_Removal_Algorithm fl = new Floyed_Cycle_Removal_Algorithm();
        fl.addLast(1);
        fl.addLast(2);
        fl.addLast(3);
        fl.addLast(4);
        fl.addLast(5);
        fl.addLast(6);
        fl.addLast(7);
        fl.addLast(8);
        fl.createCycle();
        //fl.floyedCycle();
        fl.cycleRemoval();


        fl.Display();
    }
}
