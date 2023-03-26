package lec17;

import java.util.ArrayList;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.size());

        //-------------Enhanced For Loop-------------//

//        for (int i : list) {
//            System.out.print(i + " ");
//        }
//        for (Integer i : list) {
//            System.out.print(i + " ");
//        }
        list.add(1,4);
        System.out.println(list);
        list.add(4,10);
        System.out.println(list);
        list.set(1,11);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
