package ArrayList_Practice;

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

        int ans = removeElement(arr,k);
        System.out.println(ans);
    }

    private static int removeElement(int[] arr, int k) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=k) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}
