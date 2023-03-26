package heap;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Hostel_Visit_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        long q = scanner.nextInt();
        int k = scanner.nextInt();

        hostelDistance(q,k);
    }

    private static void hostelDistance(long q, int k) {
        List<Long> queue = new LinkedList<>();
        for (int i = 0; i < q; i++) {
            long query = scanner.nextLong();
            if (query == 1){
                long x = scanner.nextLong();
                long y = scanner.nextLong();
                long ans = ((x*x) + (y*y));
                queue.add(ans);
            } else if (query == 2) {
                Collections.sort(queue);
                System.out.println(queue.get(k-1));

            }
        }
    }
}
