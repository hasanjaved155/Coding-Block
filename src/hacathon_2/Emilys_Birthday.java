package hacathon_2;

import java.util.Arrays;
import java.util.Scanner;

public class Emilys_Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(emilys_Birthday(arr));
    }

    private static int emilys_Birthday(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        while (i < arr.length - 1){
            if (arr[i] == arr[i + 1]){
                return arr[i];
            }
            i++;
        }
        return 0;
    }
}
