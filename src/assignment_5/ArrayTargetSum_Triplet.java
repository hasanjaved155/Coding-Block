package assignment_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayTargetSum_Triplet {
    static Scanner scanner = new Scanner(System.in);
    static HashMap<Integer, Integer> dp = new HashMap<>();
    static int n = scanner.nextInt();
    static int arr[];
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
            dp.put(arr[i], i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int complimentary = target-arr[i]-arr[j];
                if (dp.containsKey(complimentary) && dp.get(complimentary) > j) {
                    System.out.println(arr[i] + ", " + arr[j] + " " + "and" + " " + complimentary);
                }
            }
        }
    }
}
