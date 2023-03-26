package assignment_5;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Sum_Pairs {
    static Scanner scanner = new Scanner(System.in);
    static int n = scanner.nextInt();
    static int[] arr;
    public static void main(String[] args) {

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int target = scanner.nextInt();

        triplet(target);

    }
    private static void triplet(int target) {

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int complimentary = target-arr[i]-arr[j];
                if (complimentary==0) {
                    System.out.println(arr[i]+" "+ "and"+" "+arr[j]);
                }
            }
        }
    }
}
