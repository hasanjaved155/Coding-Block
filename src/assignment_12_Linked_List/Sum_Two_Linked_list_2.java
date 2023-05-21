package assignment_12_Linked_List;

import lec38_Linked_List.Linked_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_Two_Linked_list_2 {
    static Node head1;
    static int size1;
    static Node tail1;
    static Node head2;
    static int size2;
    static Node tail2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        addLast(arr);
        addLast2(arr2);
//        Display();
//        Display2();
        add();
    }
    public static void Display(){
        Node temp = head1;
        while(temp != null) {
            System.out.print(temp.val + " ->- ");
            temp = temp.next;
        }
        System.out.println("null");
        //System.out.println(size);
    }
    public static void Display2(){
        Node temp = head2;
        while(temp != null) {
            System.out.print(temp.val + " ->- ");
            temp = temp.next;
        }
        System.out.println("null");
        //System.out.println(size);
    }
    public static void add(){
        Node x = head1;
        Node y = head2;
        Node a = reverse(x);
        Node b = reverse(y);

        Node ans = new Node();
        ans.val = -1;
        Node temp = ans;
        int carry = 0;
        while(a != null && b != null){
            int curr = a.val + b.val + carry;
            temp.next = new Node();
            temp.next.val = curr % 10;
            temp = temp.next;
            carry = curr / 10;
            a = a.next;
            b = b.next;
        }
        while(a != null ){
            int curr = a.val + carry;
            temp.next = new Node();
            temp.next.val = curr % 10;
            temp = temp.next;
            carry = curr / 10;
            a = a.next;
        }
        while(b != null ){
            int curr = b.val + carry;
            temp.next = new Node();
            temp.next.val = curr % 10;
            temp = temp.next;
            carry = curr / 10;
            b = b.next;
        }
        if(carry > 0){
            temp.next = new Node();
            temp.next.val = carry;
        }
        print(reverse(ans.next));
    }
    public static void addLast(int[] item){
        int i = 0;
        while (i < item.length) {
            if (size1 == 0){
                addFirst(item[i]);
            }
            else {
                Node nn = new Node();
                nn.val = item[i];
                //System.out.print(nn.val+" ");
                tail1.next = nn;
                tail1 = nn;
                size1++;
            }
            i++;
        }
    }
    public static void addFirst(int item){
        Node nn = new Node();
        nn.val = item;
        if (size1 == 0){
            head1 = nn;
            tail1 = nn;
        }else {
            nn.next = head1;
            head1 = nn;
        }
        size1++;
    }
    public static void addLast2(int[] item){
        int i = 0;
        while (i < item.length) {
            if (size2 == 0){
                addFirst2(item[i]);
            }
            else {
                Node nn = new Node();
                nn.val = item[i];
                //System.out.print(nn.val+" ");
                tail2.next = nn;
                tail2 = nn;
                size2++;
            }
            i++;
        }
    }
    public static void addFirst2(int item){
        Node nn = new Node();
        nn.val = item;
        if (size2 == 0){
            head2 = nn;
            tail2 = nn;
        }else {
            nn.next = head2;
            head2 = nn;
        }
        size2++;
    }
    public static void print(Node node){
        while(node != null){
            System.out.print(node.val+" ");
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