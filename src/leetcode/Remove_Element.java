package leetcode;

import java.util.Scanner;

public class Remove_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        System.out.println(removeElements(arr,k));
    }

    private static int removeElements(int[] arr, int k) {
        int i = 0;
        int count = 0;
        while(i < arr.length){
            if (arr[i] != k){
                arr[count] = arr[i];
                count++;
            }
            i++;
        }
        return count;
    }
}
