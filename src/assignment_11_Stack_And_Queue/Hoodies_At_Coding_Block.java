package assignment_11_Stack_And_Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Hoodies_At_Coding_Block {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer>order = new LinkedList<>();
        ArrayList<Queue<Integer>>id = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
//            LinkedList<Integer>list = new LinkedList<>();
//            id.add(list);
            id.add(new LinkedList<>());
        }
        for (int i = 0; i < n; i++) {
            char ch = scanner.next().charAt(0);
            if (ch == 'E'){
                int course = scanner.nextInt();
                int roll = scanner.nextInt();
                if (id.get(course).size() == 0){
                    id.get(course).add(roll);
                    order.add(course);
                }else{
                    id.get(course).add(roll);
                }
            }else {
                int course = order.peek();
                int roll = id.get(course).remove();
                System.out.println(course+" "+roll);
                if (id.get(course).size() == 0){
                    order.remove();
                }
            }
        }
    }
}
