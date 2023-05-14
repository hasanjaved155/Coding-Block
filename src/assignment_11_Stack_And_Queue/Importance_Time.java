package assignment_11_Stack_And_Queue;

import java.util.LinkedList;
import java.util.Scanner;

public class Importance_Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> calling = new LinkedList<>();
        LinkedList<Integer> process = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            calling.add(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            process.add(scanner.nextInt());
        }
        System.out.println(time(calling,process));

    }

    private static int time(LinkedList<Integer> calling, LinkedList<Integer> process) {
        int t = 0;
        while(!calling.isEmpty()){
            if (calling.peek() == process.peek()){
                calling.remove();
                process.remove();
            }else{
                int x = calling.remove();
                calling.add(x);
            }
            t++;
        }
        return t;
    }
}
