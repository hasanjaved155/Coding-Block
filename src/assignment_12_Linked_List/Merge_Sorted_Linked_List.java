package assignment_12_Linked_List;

import lec39.Merge_Two_Sorted_List;

import java.util.Scanner;

public class Merge_Sorted_Linked_List {
    static class Node{
        Node next;
        int val;
        public Node(int item){
            this.val = item;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            Node nn = new Node(-1);
            Node temp = nn;
            for (int j = 0; j < n; j++) {
                temp.next = new Node(scanner.nextInt());
                temp = temp.next;
            }
            int m = scanner.nextInt();
            Node nn2 = new Node(-1);
            temp = nn2;
            for (int j = 0; j < m; j++) {
                temp.next = new Node(scanner.nextInt());
                temp = temp.next;
            }

            mergeSort(nn.next,nn2.next);
            System.out.println();
        }
    }

    private static void mergeSort(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(list1 != null && list2 != null){
            if (list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        if (list1 != null){
            temp.next = list1;
        }
        if (list2 != null){
            temp.next = list2;
        }
        Node temp2 = dummy.next;
        while (temp2 != null){
            System.out.print(temp2.val + " ");
            temp2 = temp2.next;
        }
    }
}