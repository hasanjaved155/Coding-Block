package assignment_14_Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Merge_K_Sorted_List {
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
        int m = scanner.nextInt();
        Node[] list = new Node[n];
        for (int i = 0; i < n; i++) {
            list[i] = new Node(-1);
            Node temp = list[i];
            for (int j = 0; j < m; j++) {
                temp.next = new Node(scanner.nextInt());
                temp = temp.next;
            }
        }
        Node ans = mergeKSorted(list);
        Node temp = ans;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    private static Node mergeKSorted(Node[] list) {
        PriorityQueue<Node>pq = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.val - o2.val;
            }
        });
        for (int i = 0; i < list.length; i++) {
            pq.add(list[i].next);
        }
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (pq.size() != 0){
            Node rv = pq.poll();
            temp.next = rv;
            temp = temp.next;
            if (rv.next != null){
                pq.add(rv.next);
            }
        }
        return dummy.next;
    }
}
