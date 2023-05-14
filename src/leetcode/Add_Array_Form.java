package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_Array_Form {
    public static void main(String[] args) {
        int[] arr = {7};
        int k = 993;
        List<Integer> list = addToArray(arr,k);
        System.out.println(list);
    }

    private static List<Integer> addToArray(int[] arr, int k) {
        List<Integer>list = new ArrayList<>();
        String str = String.valueOf(k);
        int carry = 0;
        int j = str.length() - 1;
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (j >= 0) {
                int ans = arr[i] + str.charAt(j) - '0' + carry;
                list.add(ans % 10);
                carry = ans/10;
                j--;
            }else{
                int ans = arr[i] + carry;
                list.add(ans % 10);
                carry = ans/10;
            }
        }
        while(j >= 0){
            int ans = str.charAt(j) - '0' + carry;
            list.add(ans % 10);
            carry = ans / 10;
            j--;
        }
        if (carry != 0){
            list.add(carry);
        }
        Collections.reverse(list);
        return list;
    }
}
