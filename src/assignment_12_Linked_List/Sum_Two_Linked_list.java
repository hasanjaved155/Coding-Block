package assignment_12_Linked_List;

import java.util.Scanner;

public class Sum_Two_Linked_list {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        Node a = new Node(-1);
        Node temp = a;
        for(int i=0;i<size1;i++){
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        Node b = new Node(-1);
        temp = b;
        for(int i=0;i<size2;i++){
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        add(a.next, b.next);

    }
    public static void add(Node a, Node b){
        a = reverse(a);
        b = reverse(b);


        Node ans = new Node(-1);
        Node temp = ans;
        int carry = 0;
        while(a != null && b != null){
            int curr = a.data + b.data + carry;
            temp.next = new Node(curr % 10);
            temp = temp.next;
            carry = curr / 10;
            a = a.next;
            b = b.next;
        }
        while(a != null ){
            int curr = a.data + carry;
            temp.next = new Node(curr % 10);
            temp = temp.next;
            carry = curr / 10;
            a = a.next;
        }
        while(b != null ){
            int curr = b.data + carry;
            temp.next = new Node(curr%10);
            temp = temp.next;
            carry = curr / 10;
            b = b.next;
        }
        if(carry > 0){
            temp.next = new Node(carry);
        }
        print(reverse(ans.next));
    }
    public static void print(Node node){
        while(node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public static Node reverse(Node node){
        Node prev = null;
        while(node != null){
            Node next = node.next;
            node.next = prev;
            prev= node;
            node= next;
        }
        return prev;
    }
}