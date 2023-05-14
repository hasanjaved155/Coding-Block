package lec35_Inheritance;

import lec35_Data_Structures.Queue;

public class Dynamic_Queue extends Queue {

    @Override
    public void enque(int item) throws Exception{
        if (isFull()){
            int[] narr = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                int index = (i + front) % arr.length;
                narr[i] = arr[index];
            }
            arr = narr;
            front = 0;
        }
        super.enque(item);
    }

}
