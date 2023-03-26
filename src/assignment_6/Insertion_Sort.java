package assignment_6;

import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        insertion_Sort(arr,n);
    }

    private static void insertion_Sort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 ; j--) {
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
