package assignment_12_Linked_List;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Triplet_Sum_LL {
    static class Node{
        Node next;
        int val;
        public Node(int data){
            this.val = data;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();
        Node headA = new Node(-1);
        Node temp = headA;
        for (int i = 0; i < n; i++) {
            temp.next = new Node(scanner.nextInt());
            temp = temp.next;
        }
        Node headB = new Node(-1);
        temp = headB;
        for (int i = 0; i < m; i++) {
            temp.next = new Node(scanner.nextInt());
            temp = temp.next;
        }
        Node headC = new Node(-1);
        temp = headC;
        for (int i = 0; i < l; i++) {
            temp.next = new Node(scanner.nextInt());
            temp = temp.next;
        }

        int target = scanner.nextInt();
        triplet(headA.next,headB.next,headC.next,target);
    }

    private static void triplet(Node headA, Node headB, Node headC,int target) {

        Node tempA = headA;
        while (tempA != null){
            int vala = target - tempA.val;
            Node tempB = headB;
            while (tempB != null){
                int valb = vala - tempB.val;
                Node tempC = headC;
                while (tempC != null){
                  int valc = valb - tempC.val;
                  if (valc == 0){
                      System.out.print(tempA.val + " " + tempB.val + " " + tempC.val);
                      return;
                  }
                  tempC = tempC.next;
                }
                tempB = tempB.next;
            }
            tempA = tempA.next;
        }
    }
}
