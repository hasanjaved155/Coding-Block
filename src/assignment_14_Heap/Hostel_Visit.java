package assignment_14_Heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Hostel_Visit {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int q = scanner.nextInt();
        int k = scanner.nextInt();
        visit(q,k);
    }

    private static void visit(int q, int k) {
        PriorityQueue<Long>pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < q; i++) {
            int type = scanner.nextInt();

            if (type == 1){
                long x = scanner.nextInt();
                long y = scanner.nextInt();
                pq.add((x * x) + (y * y));

                if (pq.size() > k){
                    pq.poll();
                }
            } else if (type == 2) {
                System.out.println(pq.peek());
            }
        }
    }
}
