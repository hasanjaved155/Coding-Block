package heap;

import java.util.*;

public class Hostel_Visit {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int q = scanner.nextInt();
        int k = scanner.nextInt();

        hostelDistance(q,k);
    }

    private static void hostelDistance(int q, int k) {
        PriorityQueue<Long>queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < q; i++) {
            long query = scanner.nextLong();
            if (query == 1){
                long x = scanner.nextLong();
                long y = scanner.nextLong();
                long ans = ((x*x) + (y*y));
                queue.add(ans);
                if(queue.size()>k)queue.remove();
            } else if (query == 2) {

                System.out.println(queue.peek());


            }
        }
    }
}
