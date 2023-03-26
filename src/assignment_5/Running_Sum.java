package assignment_5;

import java.util.Scanner;

public class Running_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        running(arr,n);
    }

    private static void running(int[] arr, int n) {
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            sum = sum + arr[i];
            System.out.print(sum+" ");
        }
    }
}
