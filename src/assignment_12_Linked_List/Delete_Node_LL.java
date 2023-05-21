package assignment_12_Linked_List;

import java.util.Scanner;

public class Delete_Node_LL {
    static class Node{
        int val;
        Node next;
    }
    static Node head;
    static int size;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        head = new Node();
        Node temp = head;
        temp.val = -1;
        for(int i = 0; i < n; i++){
            temp.next = new Node();
            temp.next.val = scanner.nextInt();
            temp = temp.next;
        }
        remove();
        display();
    }

    private static void display() {
        Node temp = head.next;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    private static void remove() {
        Node temp = head.next;
        Node x = temp;
        while (temp != null){
            if (size == 0 && temp.val < temp.next.val){
                Node l = x;
                temp = temp.next;
                x = temp;
                l.next = null;
                size++;
            }else if(temp.val < temp.next.val){
                x.next = temp.next;
                Node y = temp;
                temp = temp.next;
                y.next = null;
                size++;
            }else{
                x = temp;
                temp = temp.next;
                size++;
            }
        }
    }
}