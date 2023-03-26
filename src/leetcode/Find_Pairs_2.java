package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Find_Pairs_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        System.out.println(findPairs(arr,k));
    }

    private static int findPairs(int[] arr, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],j+1);
            }else{
                map.put(arr[i],j);
            }
        }
       // System.out.println(map);
        int count = 0;
        for (Map.Entry<Integer,Integer> m : map.entrySet()){
            int key = (int) m.getKey();
            int value = (int) m.getValue();
            int req = key - k;
            if (map.containsKey(req)){
                if (req == key){
                    count = count + ((map.get(key) > 1) ? 1 : 0);
                }else count++;
            }
        }
        return count;
    }
}
