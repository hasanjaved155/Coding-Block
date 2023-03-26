package lec18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays_Sum_Two_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int [] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        arraySum(arr,arr2);
    }

    private static void arraySum(int[] arr, int[] arr2) {
        int i = arr.length-1;
        int j = arr2.length-1;
        int carry = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i >= 0 && j >= 0){
            int sum = arr[i] + arr2[j] + carry;
            list.add(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        while(i >= 0){
            int sum = arr[i] +  carry;
            list.add(sum % 10);
            carry = sum / 10;
            i--;
        }
        while(j >= 0){
            int sum = arr2[j] + carry;
            list.add(sum % 10);
            carry = sum / 10;
            j--;
        }
        if (carry != 0)list.add(carry);
//        for (int k = list.size()-1; k >= 0; k--) {
//            System.out.print(list.get(k)+", ");
//        }
//        System.out.print("END");
        Collections.reverse(list);
        for (int k = 0; k < list.size(); k++) {
            System.out.print(list.get(k)+", ");
        }
        System.out.print("END");
    }
}
