package lec46_OOPS_Comparator_Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Car_Client {
    public static void main(String[] args) {
        Cars[] arr = new Cars[5];
        arr[0] = new Cars(100, 20, "black");
        arr[1] = new Cars(1000,10,"blue");
        arr[2] = new Cars(200,25,"voilet");
        arr[3] = new Cars(2000,30,"yellow");
        arr[4] = new Cars(8907,6,"red");
        //bubbleSort(arr,new Car_Comparator_Price());
        Arrays.sort(arr, new Comparator<Cars>() {
            @Override
            public int compare(Cars o1, Cars o2) {
                //return o1.color.compareTo(o2.color);
                return o2.price - o1.price;
            }
        });
        display(arr);
    }

    private static <T> void bubbleSort(T[] arr, Comparator<T> cmp) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (cmp.compare(arr[j],arr[j + 1]) > 0){
                    T k = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = k;
                }
            }
        }
    }

    private static void display(Cars[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
//    private static <T extends Comparable<T>> void bubbleSort(T[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j].compareTo(arr[j + 1]) >  0){
//                    T k = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = k;
//                }
//            }
//        }
//    }
}
