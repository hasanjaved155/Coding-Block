package assignment_5;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_Of_Roses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int target = scanner.nextInt();

            Arrays.sort(arr);
            triplet(target, arr);
        }
    }

    private static void triplet(int target, int[] arr) {

        int i = 0;
        int j = 0;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                i = arr[left];
                j = arr[right];

                left++;

                right--;
            }

        }
        System.out.println("Deepak should buy roses whose prices are " + i + " and " + j + ".");
    }
}
