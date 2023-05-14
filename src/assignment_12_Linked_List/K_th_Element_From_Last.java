package assignment_12_Linked_List;

import java.util.ArrayList;
import java.util.Scanner;

public class K_th_Element_From_Last {
    static Node head;
    static int size;
    static Node tail;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        while (true) {
            int x = scanner.nextInt();
            if (x == -1){
                break;
            }
            list.add(x);
        }
        int n = list.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }
        int k = scanner.nextInt();
        addLast(arr);
        System.out.println(kth_Last_Element(k));
    }

    private static int kth_Last_Element(int k) {
        Node slow = head;
        Node fast = head;
        int count = 1;
        while (count < k) {
            fast = fast.next;
            count++;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }

    public static void addLast(int[] item){
        int i = 0;
        while (i < item.length) {
            if (size == 0){
                addFirst(item[i]);
            }
            else {
                Node nn = new Node();
                nn.val = item[i];
                tail.next = nn;
                tail = nn;
                size++;
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
        size++;
    }
}
