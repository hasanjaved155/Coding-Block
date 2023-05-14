package lec35_Inheritance;

import lec35_Data_Structures.Stack;
public class Dynamic_Stack extends Stack {
    @Override
    public void push(int item) throws Exception {
        if (isFull()){
            int[] narr = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                narr[i] = arr[i];
            }
            arr = narr;
        }
        super.push(item);
    }
}
