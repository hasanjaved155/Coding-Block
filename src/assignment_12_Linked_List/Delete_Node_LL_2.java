package assignment_12_Linked_List;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Delete_Node_LL_2 {
    static class Node{
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
        int[] brr = nextGreater(arr);
        addLast(brr,arr);
        display();
    }

    private static int[] nextGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] brr = new int[arr.length];
        int i = 0;
        while(i < arr.length) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                int ans = st.pop();
                brr[ans] = arr[i];
            }
            st.push(i);
            i++;
        }
        while (!st.isEmpty()){
            int ans = st.pop();
            brr[ans] = -1;
        }
        return brr;
    }

    private static void display() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    private static void addLast(int[] brr,int[] arr) {
        int i = 0;
        while(i < brr.length){
            if (size == 0 && brr[i] == -1){
                addFirst(arr[i]);
            }else if(brr[i] == -1){
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
            size++;
        }else {
            nn.next = head;
            head = nn;
            size++;
        }
    }
}
