package lec9;

import java.util.Scanner;

public class Max_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //int [] arr ={2,3,1,4,5,6};
        int max_1 = arr[0];
        System.out.println(max(arr,max_1));
    }

    private static int max(int[] arr, int max_1) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max_1)max_1 = arr[i];
        }
        return max_1;
    }
}
