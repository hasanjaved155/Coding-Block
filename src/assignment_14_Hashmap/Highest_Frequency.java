package assignment_14_Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Highest_Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        frequency(arr);
    }

    private static void frequency(int[] arr) {
        HashMap<Integer, Integer>map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int find = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            if (e.getValue() > max){
                max = e.getValue();
                find = e.getKey();
            }
        }
        System.out.println(find);
    }
}
