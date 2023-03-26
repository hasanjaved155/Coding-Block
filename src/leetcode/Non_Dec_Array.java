package leetcode;

import java.util.Scanner;

public class Non_Dec_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(checkPossibility(arr));
    }

    private static boolean checkPossibility(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]){
                count++;
                if (count > 1)return false;

                if (i > 0 && arr[i - 1] > arr[i + 1])arr[i + 1] = arr[i];
            }
        }
        return true;
    }
}
