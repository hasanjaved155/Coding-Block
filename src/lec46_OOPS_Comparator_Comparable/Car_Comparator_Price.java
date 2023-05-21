package lec46_OOPS_Comparator_Comparable;

import java.util.Comparator;

public class Car_Comparator_Price implements Comparator<Cars> {

    @Override
    public int compare(Cars o1, Cars o2) {
        return o2.price - o1.price;
        //return o2.speed - o1.speed;
        //return o1.color.compareTo(o2.color);
    }
}
