package assignment_12_Linked_List;

import java.util.Scanner;

public class LL_K_Append {
    static class Node {
        int val;
        Node next;
    }
    static Node head;
    static Node tail;
    static int size;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        addLast(arr);
        append(k);
        display();
    }

    private static void display() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    private static void addLast(int[] arr) {
        int i = 0;
        while(i < arr.length){
            if (size == 0){
                addFirst(arr[i]);
            }else {
                Node nn = new Node();
                nn.val = arr[i];
                tail.next = nn;
                tail = nn;
                size++;
            }
            i++;
        }
    }

    private static void addFirst(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0){
            head = nn;
            tail = nn;
        }else {
            nn.next = head;
            head = nn;
        }
        size++;
    }

    private static void append(int k) {
        int i = 0;
        while(i < k) {
            int x = removeLast();
            addFirst(x);
            i++;
        }
    }
    public static int removeLast(){
        if (size == 1) {
            return removeFirst();
        } else {
            Node rv = getNode(size - 2);
            int val = tail.val;
            rv.next = null;
            tail = rv;
            size--;
            return val;
        }
    }
    private static Node getNode(int k){
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private static int removeFirst(){
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
}
