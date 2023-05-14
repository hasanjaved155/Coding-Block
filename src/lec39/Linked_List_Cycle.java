package lec39;


import lec38_Linked_List.Linked_List;

public class Linked_List_Cycle {
    public class Node {
        int val;
        Node next;
    }

    private Node head;
    private int size;
    private Node tail;

    public void addFirst(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void addLast(int item) {
        if (size == 0) {
            addFirst(item);
        }
        Node nn = new Node();
        nn.val = item;
        tail.next = nn;
        tail = nn;
        size++;
    }

    public void createCycle() {
        tail.next = head; // circular
        tail.next = head.next; // cycle
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ->- ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println(size);
    }

    public static void main(String[] args) {
        Linked_List_Cycle l = new Linked_List_Cycle();
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(4);
        l.addFirst(5);
        l.addFirst(6);
        //l.Display();
        l.createCycle();
        //l.Display();
        System.out.println(l.hasCycle());
    }

    public boolean hasCycle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
