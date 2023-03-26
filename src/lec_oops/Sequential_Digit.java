package lec_oops;

import java.util.ArrayList;
import java.util.List;

public class Sequential_Digit {
    public static void main(String[] args) {
        int low = 100;
        int high = 300;
        //List<Integer> ans = Sequential_Digit.sequentialDigits(low,high);// oops concept // static method call
        List<Integer> ans = sequentialDigits(low,high);
        System.out.println(ans);
        Sequential_Digit s = new Sequential_Digit();// oops concept // non static method call
        List<Integer> ans2 = s.sequentialDigits2(low, high);
        System.out.println(ans2);
    }

    private List<Integer> sequentialDigits2(int low, int high) {
        List<Integer> list = new ArrayList<>();

        int[] arr = {
                12, 23, 34, 45, 56, 67, 78, 89,
                123, 234, 345, 456, 567, 678, 789,
                1234, 2345, 3456, 4567, 5678, 6789,
                12345, 23456, 34567, 45678, 56789,
                123456, 234567, 345678, 456789,
                1234567, 2345678, 3456789,
                12345678, 23456789,
                123456789
        };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < low) continue;
            if (arr[i] > high) break;
            list.add(arr[i]);
        }
        return list;
    }

    private static List<Integer> sequentialDigits(int low, int high) {
        List<Integer>list = new ArrayList<>();

        int[] arr = {
        12,23,34,45,56,67,78,89,
        123,234,345,456,567,678,789,
        1234,2345,3456,4567,5678,6789,
        12345,23456,34567,45678,56789,
        123456,234567,345678,456789,
        1234567,2345678,3456789,
        12345678,23456789,
        123456789
        };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < low)continue;
            if (arr[i] > high)break;
            list.add(arr[i]);
        }
        return list;
    }
}
