package heap;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Hostel_Visit_2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        long q = scanner.nextInt();
        long k = scanner.nextInt();

        hostelDistance(q,k);
    }

    private static void hostelDistance(long q, long k) {
        PriorityQueue<Long>queue = new PriorityQueue<>();
        for (int i = 0; i < q; i++) {
            long query = scanner.nextLong();
            if (query == 1){
                long x = scanner.nextLong();
                long y = scanner.nextLong();
                long ans = ((x*x) + (y*y));
                queue.add(ans);
            } else if (query == 2) {
                Stack<Long> temp = new Stack<>();

                for (int j = 0; j < k-1; j++) {
                    temp.push(queue.remove());
                }

                System.out.println(queue.peek());

                while (!temp.empty()){
                    queue.add(temp.pop());
                }

            }
        }
    }
}
