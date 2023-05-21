package assignment_12_Linked_List;

import java.util.Scanner;


public class LL_Odd_Even {
    class Node{
        int val;
        Node next;
    }
    Node head;
    int size;
    Node tail;

    public static void main(String[] args) {
        LL_Odd_Even x = new LL_Odd_Even();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        x.addLast_Odd(arr);
        x.addLast_Even(arr);
        x.Display();
    }
    public void addLast_Odd(int[] item){
        int i = 0;
        while (i < item.length) {
            if (size == 0 && item[i] % 2 != 0) {
                addFirst(item[i]);
            }else if(item[i] % 2 != 0) {
                Node nn = new Node();
                nn.val = item[i];
                tail.next = nn;
                tail = nn;
                size++;
            }
            i++;
        }
    }
    private void addLast_Even(int[] item) {
        int i = 0;
        while (i < item.length) {
            if (size == 0 && item[i] % 2 == 0) {
                addFirst(item[i]);
            }else if(item[i] % 2 == 0) {
                Node nn = new Node();
                nn.val = item[i];
                tail.next = nn;
                tail = nn;
                size++;
            }
            i++;
        }
    }
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
    public void Display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
