package assignment_12_Linked_List;

import lec39.Linked_List_Cycle;
import lec43.Floyed_Cycle_Removal_Algorithm;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;


public class Cycle_Detection_Removal_LL {

    static class Node {
        public int data;
        public Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {

        Node head = buildCycleList();

        boolean cyclePresent = floydCycleRemoval(head);
        if (cyclePresent) {
            System.out.println("Cycle was present");
        } else {
            System.out.println("No cycle");
        }

        System.out.print("Linked List - ");
        printLinkedList(head);
    }
    public static Node buildCycleList() {
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, Node> hash = new Hashtable<Integer, Node>();
        int x = sc.nextInt();
        if (x == -1) {
            return null;
        }
        Node head = new Node(x);
        hash.put(x, head);
        Node current = head;
        while (x != -1) {
            x = sc.nextInt();
            if (x == -1)
                break;
            if (hash.containsKey(x)) {
                current.next = hash.get(x);
                return head;
            }
            Node n = new Node(x);
            current.next = n;
            current = n;
            hash.put(x, n);
        }
        current.next = null;
        return head;
    }
    private static boolean floydCycleRemoval(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null && fast != slow) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast == null || fast.next == null) {
            return false;
        }

        if (fast.next == head) {
            fast.next = null;
            return true;
        }

        slow = head;
        fast = fast.next;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
        return true;
    }

    public static void printLinkedList(Node head) {
        HashSet<Integer> s = new HashSet<Integer>();
        while (head != null) {
            if (s.contains(head.data)) {
                System.out.println("\nCycle detected at " + head.data);
                return;
            }
            System.out.print(head.data + " ");
            s.add(head.data);
            head = head.next;
        }
    }
}

