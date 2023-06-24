package assignment_14_Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Exit_Or_Not {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            exitOrNot(arr);
        }
    }

    private static void exitOrNot(int[] arr) {
        HashMap<Integer, Integer>map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            if (map.containsKey(x)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
