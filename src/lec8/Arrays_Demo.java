package lec8;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
