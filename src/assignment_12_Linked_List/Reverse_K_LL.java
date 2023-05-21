package assignment_12_Linked_List;

import java.util.Scanner;

public class Reverse_K_LL {
    static class Node{
        int val;
        Node next;
        public Node(int item){
            this.val = item;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Node head = new Node(-1);
        Node temp = head;
        for (int i = 0; i < n; i++) {
            temp.next = new Node(scanner.nextInt());
            temp = temp.next;
        }
        reverse_K(head.next,k);
    }

    private static void reverse_K(Node head, int k) {
        Node ans = new Node(-1);
        Node ans2 = ans;
        Node a = head;
        while(a != null) {
            Node head2 = new Node(-1);
            Node temp = head2;
            int i = 0;
            while (i < k) {
                temp.next = new Node(a.val);
                temp = temp.next;
                a = a.next;
                i++;
            }
            head2 = reverse(head2.next);
            while (head2 != null){
                ans2.next = new Node(head2.val);
                head2 = head2.next;
                ans2 = ans2.next;
            }
        }
        display(ans.next);
    }

    private static void display(Node ans) {
        Node temp = ans;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    private static Node reverse(Node node) {
       Node prev = null;
        while(node != null){
            Node ahead = node.next;
            node.next = prev;
            prev = node;
            node = ahead;
        }
        return prev;
    }
}
