package lec9;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int find = scanner.nextInt();
//        int [] arr ={2,3,1,4,5,6};
//        int find = 4;
        System.out.println(linear(arr,find));
    }

    private static int linear(int[] arr, int find) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==find) return i;
        }
        return -1;
    }
}
