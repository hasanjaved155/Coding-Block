package lec17;

import java.util.ArrayList;

public class Arraylist_Demo_2 {
    public static void main(String[] args) {
        // auto-boxing
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);

        System.out.println(list);
        System.out.println(list.size());
        // enhanced for loop
        // unboxing
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int val : list) {
            System.out.print(val +" ");
        }
    }
}
