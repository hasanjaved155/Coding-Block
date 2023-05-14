package assignment_12_Linked_List;

import java.util.Scanner;

class Node{
    int val;
    Node next;
}
public class LL_Odd_Even {
    static Node head;
    static int size;
    static Node tail;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        addLast_Odd(arr);
        addLast_Even(arr);
        Display();
    }
    public static void addLast_Odd(int[] item){
        int i = 0;
        while (i < item.length) {
            if (size == 0 && item[i] % 2 != 0) {
                addFirst(item[i]);
            }else if(item[i] % 2 != 0) {
                Node nn = new Node();
                nn.val = item[i];
                tail.next = nn;
                tail = nn;
                //size++;
            }
            i++;
        }
    }
    private static void addLast_Even(int[] item) {
        int i = 0;
        while (i < item.length) {
            if (size == 0 && item[i] % 2 == 0) {
                addFirst(item[i]);
            }else if(item[i] % 2 == 0) {
                Node nn = new Node();
                nn.val = item[i];
                tail.next = nn;
                tail = nn;
                //size++;
            }
            i++;
        }
    }
    public static void addFirst(int item){
        Node nn = new Node();
        nn.val = item;
        if (size == 0){
            head = nn;
            tail = nn;
        }else {
            nn.next = head;
            head = nn;
        }
        //size++;
    }
    public static void Display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
