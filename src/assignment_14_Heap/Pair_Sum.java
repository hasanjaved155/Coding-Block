package assignment_14_Heap;

import java.util.PriorityQueue;

public class Pair_Sum {
    public static void main(String[] args) {
        int[] arr = {4,3,1,2};
        System.out.println(pairSum(arr));
    }

    private static int pairSum(int[] arr) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int s1 = 0;
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            int s2 = a + b;
            s1 = s1 + s2;
            pq.add(s2);
        }
        return s1;
    }
}
