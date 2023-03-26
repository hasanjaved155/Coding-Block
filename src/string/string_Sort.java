package string;

import java.util.Arrays;
import java.util.Scanner;

public class string_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void sort(String[] arr, int n) {
        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++) {

                if (compareTo(arr[i], arr[j]) > 0) {

                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    private static int compareTo(String s1, String s2) {
        int i = 0;

        while (i < s1.length() && i < s2.length()) {

            if (s1.charAt(i) > s2.charAt(i)) {

                return 1;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
            }
            i++;

        }
        if (s1.length() < s2.length()) {
            return 1;
        } else {
            return -1;
        }
    }
}
