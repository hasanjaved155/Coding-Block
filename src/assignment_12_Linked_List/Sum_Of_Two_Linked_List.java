package assignment_12_Linked_List;

import java.util.Scanner;
class Add{
    Add next;
    int val;
}
public class Sum_Of_Two_Linked_List {
    static Add head;
    static Add head1;
    static Add tail1;
    static int size1;
    static Add head2;
    static Add tail2;
    static int size2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }
        addLast(arr);
        addLast2(arr2);
        add();
        display();
    }

    private static void add() {
        int sum = 0;
        while(head1!= null && head2 != null){

        }
    }

    public static void display(){
        Add temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

//    private static void display() {
//        Add temp = head1;
//        Add temp2 = head2;
//        while (temp != null){
//            System.out.print(temp.val + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//        while (temp2 != null){
//            System.out.print(temp2.val + " ");
//            temp2 = temp2.next;
//        }
//    }

    public static void addLast(int[] item){
        int i = 0;
        while (i < item.length) {
            if (size1 == 0){
                addFirst(item[i]);
            }
            else {
                Add nn = new Add();
                nn.val = item[i];
                tail1.next = nn;
                tail1 = nn;
                size1++;
            }
            i++;
        }
    }
    public static void addFirst(int item){
        Add nn = new Add();
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
    public static void addLast2(int[] item2){
        int i = 0;
        while (i < item2.length) {
            if (size2 == 0){
                addFirst1(item2[i]);
            }
            else {
                Add nn = new Add();
                nn.val = item2[i];
                tail2.next = nn;
                tail2 = nn;
                size2++;
            }
            i++;
        }
    }
    public static void addFirst1(int item2){
        Add nn = new Add();
        nn.val = item2;
        if (size2 == 0){
            head2 = nn;
            tail2 = nn;
        }else {
            nn.next = head2;
            head2 = nn;
        }
        size2++;
    }
}
