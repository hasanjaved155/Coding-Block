package heap;

import java.util.PriorityQueue;

public class Heap_Demo_1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> x = new PriorityQueue();


        x.add(3);
        x.add(4);
        x.add(1);
        x.add(2);
        x.add(-5);


        while(!x.isEmpty()){
            System.out.println(x.peek());
            x.remove();
        }

    }
}
